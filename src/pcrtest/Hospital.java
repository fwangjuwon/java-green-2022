package pcrtest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hospital {

    private String addr; // 주소
    private long mgtStaDd; // 운영시작일자
    private String pcrPsblYn; // 구분코드
    private String ratPsblYn; // RAT가능여부
    private long recuClCd;// 요양종별코드
    private String rprtWorpClicFndtTgtYn;// 호흡기전담클리닉여부
    private String sgguCdNm;// 시군구명
    private String sidoCdNm;// 시도명
    private String telno;// 전화번호
    private long XPos;// x좌표
    private String XPosWgs84;// 세계지구x좌표
    private long YPos;// y좌표
    private String YPosWgs84;// 세계지구y좌표
    private String yadmNm;// 요양기관명
    private String ykihoEnc;// 암호화된요양기호

}
