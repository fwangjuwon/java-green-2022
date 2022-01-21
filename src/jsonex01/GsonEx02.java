package jsonex01;

import com.google.gson.Gson;

class SMSUser {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SMSUser(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"groupId":"R2GdEONszq64lNB9","successCount":1,"errorCount":0}

        // 정보
        SMSUser smsuser = new SMSUser("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();

        // json object 로 변환
        String smsReturn = gson.toJson(smsuser);
        // 변환 출력
        System.out.println(smsReturn);

        // Java object로 변환
        SMSUser javauserDto = gson.fromJson(smsReturn, SMSUser.class);
        System.out.println(javauserDto.getGroupId());
        System.out.println(javauserDto.getSuccessCount());
        System.out.println(javauserDto.getErrorCount());
    }
}