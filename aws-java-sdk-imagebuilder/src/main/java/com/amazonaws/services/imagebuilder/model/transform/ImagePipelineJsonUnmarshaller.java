/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImagePipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImagePipelineJsonUnmarshaller implements Unmarshaller<ImagePipeline, JsonUnmarshallerContext> {

    public ImagePipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImagePipeline imagePipeline = new ImagePipeline();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageRecipeArn", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setImageRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("infrastructureConfigurationArn", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setInfrastructureConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("distributionConfigurationArn", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setDistributionConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageTestsConfiguration", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setImageTestsConfiguration(ImageTestsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("schedule", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setSchedule(ScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateUpdated", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setDateUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateLastRun", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setDateLastRun(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateNextRun", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setDateNextRun(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    imagePipeline.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return imagePipeline;
    }

    private static ImagePipelineJsonUnmarshaller instance;

    public static ImagePipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImagePipelineJsonUnmarshaller();
        return instance;
    }
}
