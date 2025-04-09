from airflow import DAG #I always have to import that class to point the fact that i'm using a DAG

from datetime import datetime #a data pipeline needs a datemine at which it should being scheduled

#create an instance of the class DAG

with DAG("my_dag", start_date=datetime(2024,1,1)) as dag: 