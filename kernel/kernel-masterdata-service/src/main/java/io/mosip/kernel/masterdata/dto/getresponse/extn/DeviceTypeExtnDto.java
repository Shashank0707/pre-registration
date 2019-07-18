package io.mosip.kernel.masterdata.dto.getresponse.extn;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class for Device Type DTO
 * 
 * @author Megha Tanga
 * @since 1.0.0
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Device Type", description = "Device Type Detail resource")
public class DeviceTypeExtnDto extends BaseDto {

	@ApiModelProperty(value = "code", required = true, dataType = "java.lang.String")
	private String code;

	@ApiModelProperty(value = "langCode", required = true, dataType = "java.lang.String")
	private String langCode;

	@ApiModelProperty(value = "name", required = true, dataType = "java.lang.String")
	private String name;

	@ApiModelProperty(value = "description", required = true, dataType = "java.lang.String")
	private String description;
}