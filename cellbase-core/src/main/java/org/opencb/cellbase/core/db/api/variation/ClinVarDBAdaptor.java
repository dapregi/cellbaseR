/*
 * Copyright 2015 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencb.cellbase.core.db.api.variation;

import org.opencb.biodata.models.core.Region;
import org.opencb.cellbase.core.common.Position;
import org.opencb.commons.datastore.core.QueryOptions;
import org.opencb.commons.datastore.core.QueryResult;

import java.util.List;

/**
 * Created by imedina on 26/09/14.
 */
@Deprecated
public interface ClinVarDBAdaptor {

    QueryResult getById(String id, QueryOptions options);

    List<QueryResult> getAllByIdList(List<String> idList, QueryOptions options);


    QueryResult getAllByPosition(String chromosome, int position, QueryOptions options);

    QueryResult getAllByPosition(Position position, QueryOptions options);

    List<QueryResult> getAllByPositionList(List<Position> positionList, QueryOptions options);


    QueryResult getAllByRegion(String chromosome, int start, int end, QueryOptions options);

    QueryResult getAllByRegion(Region region, QueryOptions options);

    List<QueryResult> getAllByRegionList(List<Region> regions, QueryOptions options);

    QueryResult getListAccessions(QueryOptions queryOptions);

}
