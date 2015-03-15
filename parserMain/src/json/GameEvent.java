package json;

/**
 * Created by MainUser on 28/02/2015.
 */
public class GameEvent {
  
    private String event_name;
    private String event_description;
    private String custom_event_type;
    private String custom_event_title;
    private String custom_event_long_description;
    private String custom_event_icon_id;
    private String custom_event_action_id;
    private String custom_event_action_data;
    
//    private String custom_event_requared_items;
    private String[] custom_event_requared_itemss;
    
    private String custom_event_tags;
    
//    private String custom_event_min_goals;
    private String[] custom_event_min_goals;
    
    private String custom_event_min_goals_description;
    private String custom_event_priority;
    private String custom_event_versions_list;
    private String custom_event_is_vip;
    
//    private String countries_filter;
    private String[] countries_filter;
    
//    private String tournament_rank_intervals;
    private RankInterval[] tournament_rank_intervals;
    
//    private String tournament_gifts;
    private TournamentGifts[][] tournament_gifts;
    
    private String tournament_type;
    private String tournament_delivery;
    private String leaderboard_order;
    private String leaderboard_type;
    private int leaderboard_group_size;
    
    
    public GameEvent() {
    }
    
    
    public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public String getCustom_event_type() {
		return custom_event_type;
	}
	public void setCustom_event_type(String custom_event_type) {
		this.custom_event_type = custom_event_type;
	}
	public String getCustom_event_title() {
		return custom_event_title;
	}
	public void setCustom_event_title(String custom_event_title) {
		this.custom_event_title = custom_event_title;
	}
	public String getCustom_event_long_description() {
		return custom_event_long_description;
	}
	public void setCustom_event_long_description(
			String custom_event_long_description) {
		this.custom_event_long_description = custom_event_long_description;
	}
	public String getCustom_event_icon_id() {
		return custom_event_icon_id;
	}
	public void setCustom_event_icon_id(String custom_event_icon_id) {
		this.custom_event_icon_id = custom_event_icon_id;
	}
	public String getCustom_event_action_id() {
		return custom_event_action_id;
	}
	public void setCustom_event_action_id(String custom_event_action_id) {
		this.custom_event_action_id = custom_event_action_id;
	}
	public String getCustom_event_action_data() {
		return custom_event_action_data;
	}
	public void setCustom_event_action_data(String custom_event_action_data) {
		this.custom_event_action_data = custom_event_action_data;
	}
	public String[] getCustom_event_requared_itemss() {
		return custom_event_requared_itemss;
	}
	public void setCustom_event_requared_itemss(
			String[] custom_event_requared_itemss) {
		this.custom_event_requared_itemss = custom_event_requared_itemss;
	}
	public String getCustom_event_tags() {
		return custom_event_tags;
	}
	public void setCustom_event_tags(String custom_event_tags) {
		this.custom_event_tags = custom_event_tags;
	}
	public String[] getCustom_event_min_goals() {
		return custom_event_min_goals;
	}
	public void setCustom_event_min_goals(String[] custom_event_min_goals) {
		this.custom_event_min_goals = custom_event_min_goals;
	}
	public String getCustom_event_min_goals_description() {
		return custom_event_min_goals_description;
	}
	public void setCustom_event_min_goals_description(
			String custom_event_min_goals_description) {
		this.custom_event_min_goals_description = custom_event_min_goals_description;
	}
	public String getCustom_event_priority() {
		return custom_event_priority;
	}
	public void setCustom_event_priority(String custom_event_priority) {
		this.custom_event_priority = custom_event_priority;
	}
	public String getCustom_event_versions_list() {
		return custom_event_versions_list;
	}
	public void setCustom_event_versions_list(String custom_event_versions_list) {
		this.custom_event_versions_list = custom_event_versions_list;
	}
	public String getCustom_event_is_vip() {
		return custom_event_is_vip;
	}
	public void setCustom_event_is_vip(String custom_event_is_vip) {
		this.custom_event_is_vip = custom_event_is_vip;
	}
	public String[] getCountries_filter() {
		return countries_filter;
	}
	public void setCountries_filter(String[] countries_filter) {
		this.countries_filter = countries_filter;
	}
	public RankInterval[] getTournament_rank_intervals() {
		return tournament_rank_intervals;
	}
	public void setTournament_rank_intervals(
			RankInterval[] tournament_rank_intervals) {
		this.tournament_rank_intervals = tournament_rank_intervals;
	}
	public TournamentGifts[][] getTournament_gifts() {
		return tournament_gifts;
	}
	public void setTournament_gifts(TournamentGifts[][] tournament_gifts) {
		this.tournament_gifts = tournament_gifts;
	}
	public String getTournament_type() {
		return tournament_type;
	}
	public void setTournament_type(String tournament_type) {
		this.tournament_type = tournament_type;
	}
	public String getTournament_delivery() {
		return tournament_delivery;
	}
	public void setTournament_delivery(String tournament_delivery) {
		this.tournament_delivery = tournament_delivery;
	}
	public String getLeaderboard_order() {
		return leaderboard_order;
	}
	public void setLeaderboard_order(String leaderboard_order) {
		this.leaderboard_order = leaderboard_order;
	}
	public String getLeaderboard_type() {
		return leaderboard_type;
	}
	public void setLeaderboard_type(String leaderboard_type) {
		this.leaderboard_type = leaderboard_type;
	}
	public int getLeaderboard_group_size() {
		return leaderboard_group_size;
	}
	public void setLeaderboard_group_size(int leaderboard_group_size) {
		this.leaderboard_group_size = leaderboard_group_size;
	}


	public class RankInterval{
    	int fromInt;
    	int toInt;
    }
    public class TournamentGifts{
    	String name;
    	int value;
    }
    
}
