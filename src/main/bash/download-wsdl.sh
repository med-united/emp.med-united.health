#!/bin/bash
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/tel/error/TelematikError.xsd
mkdir -p tel/error
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/tel/version/ProductInformation.xsd
mkdir -p tel/version
mv ProductInformation.xsd tel/version
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/ext/oasis-dss-core-schema-v1.0-os.xsd
mkdir ext
mv oasis-dss-core-schema-v1.0-os.xsd ext
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/ext/xml.xsd
mv xml.xsd ext
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/ext/oasis-sstc-saml-schema-assertion-1.1.xsd
mv oasis-sstc-saml-schema-assertion-1.1.xsd ext
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/ext/xmldsig-core-schema.xsd
mv xmldsig-core-schema.xsd ext
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/ext/XMLSchema.dtd
mv XMLSchema.dtd ext
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/ext/datatypes.dtd
mv datatypes.dtd ext
mkdir -p conn/amtss
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/amtss/AMTSService.wsdl
mv AMTSService.wsdl conn/amtss
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/amtss/AMTSService.xsd
mv AMTSService.xsd conn/amtss
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/CardService.wsdl
mv CardService.wsdl conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/CardService.xsd
mv CardService.xsd conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/CardTerminalInfo.xsd
mv CardTerminalInfo.xsd conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/ConnectorContext.xsd
mv ConnectorContext.xsd conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/ConnectorCommon.xsd
mv ConnectorCommon.xsd conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/CardServiceCommon.xsd
mv CardServiceCommon.xsd conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/EventService.wsdl
mv EventService.wsdl conn
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/conn/EventService.xsd
mv EventService.xsd conn
# wget https://update.kbv.de/ita-update/Verordnungen/Arzneimittel/BMP/BMP_V2.6.zip
mkdir ../xsd
#unzip BMP_V2.6.zip bmp_V2.6.xsd
#rm BMP_V2.6.zip
# mv bmp_V2.6.xsd ../xsd
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/fa/amtss/AMTS_Document_v1_6.xsd
mv AMTS_Document_v1_6.xsd ../xsd
wget https://raw.githubusercontent.com/gematik/api-telematik/OPB4/fa/amtss/AMTS_Einwilligung_Document_v1_0.xsd
mv AMTS_Einwilligung_Document_v1_0.xsd ../xsd
