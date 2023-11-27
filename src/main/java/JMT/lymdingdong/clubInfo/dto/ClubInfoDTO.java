package JMT.lymdingdong.clubInfo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@Builder
public class ClubInfoDTO {

    private String category;
    private String clubName;
    private String activityDescription;
    private String activitySchedule;
    private String membershipFee;
    private String clubLocation;
    private String photoUrl1;
    private String photoUrl2;
    private String photoUrl3;
}