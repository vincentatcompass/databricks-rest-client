/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.service;

import com.edmunds.rest.databricks.DTO.AutoScaleDTO;
import com.edmunds.rest.databricks.DTO.ClusterInfoDTO;
import com.edmunds.rest.databricks.DatabricksRestException;
import com.edmunds.rest.databricks.request.CreateClusterRequest;
import com.edmunds.rest.databricks.request.EditClusterRequest;

import java.io.IOException;

/**
 *
 */
public interface ClusterService {

    String create(CreateClusterRequest createClusterRequest) throws IOException, DatabricksRestException;
    void edit(EditClusterRequest editClusterRequest) throws IOException, DatabricksRestException;
    void start(String clusterId) throws IOException, DatabricksRestException;
    void restart(String clusterId) throws IOException, DatabricksRestException;
    void resize(int numWorkers, String clusterId) throws IOException, DatabricksRestException;
    void resize(AutoScaleDTO autoscale, String clusterId) throws IOException, DatabricksRestException;
    void delete(String clusterId) throws IOException, DatabricksRestException;
    ClusterInfoDTO getInfo(String clusterId) throws IOException, DatabricksRestException;
    ClusterInfoDTO[] list() throws IOException, DatabricksRestException;

}
