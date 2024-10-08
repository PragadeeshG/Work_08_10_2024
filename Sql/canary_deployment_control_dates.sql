create table if not exists canary_deployment_control_dates(
canary_deployment_release_indicator Integer not null,
phase_name varchar(255) null,
work_item_number Integer null,
azure_story_completion_date varchar(255) null,
sit_start_date varchar(255) null,
sit_completion_date varchar(255) null,
uat_start_date varchar(255) null,
uat_completion_date varchar(255) null,
staging_start_date varchar(255) null,
staging_completion_date varchar(255) null,
canary_deployment_release_date varchar(255) null,
uvt_date varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint canary_deployment_control_dates_pk primary key(canary_deployment_release_indicator));