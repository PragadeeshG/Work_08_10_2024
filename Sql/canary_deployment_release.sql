create table if not exists canary_deployment_release(
canary_deployment_release_indicator Integer not null,
kube_engine varchar(255) null,
cloud_run varchar(255) null,
app_engine varchar(255) null,
app_name varchar(255) null,
project_code varchar(255) null,
deployment_indicator bigint null,
gube_enterprise varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint canary_deployment_release_pk primary key(canary_deployment_release_indicator));