//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int
import kotlin.Unit

/**
 * DataEvent
 *
 * Generated from 'DataEvent' enum
 */
public sealed class DataEvent : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'Peer' variant
     */
    public data class Peer(
        public val peerEvent: PeerEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Peer>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Peer> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Peer =
                try {
                    Peer(
                        PeerEvent.read(reader),
                    )
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Peer,
            ): Unit = try {
                PeerEvent.write(writer, instance.peerEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Domain' variant
     */
    public data class Domain(
        public val domainEvent: DomainEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Domain>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Domain> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Domain = try {
                Domain(
                    DomainEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Domain,
            ): Unit = try {
                DomainEvent.write(writer, instance.domainEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Account' variant
     */
    public data class Account(
        public val accountEvent: AccountEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Account>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Account> {
            public const val DISCRIMINANT: Int = 2

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Account = try {
                Account(
                    AccountEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Account,
            ): Unit = try {
                AccountEvent.write(writer, instance.accountEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'AssetDefinition' variant
     */
    public data class AssetDefinition(
        public val assetDefinitionEvent: AssetDefinitionEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.AssetDefinition>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.AssetDefinition> {
            public const val DISCRIMINANT: Int = 3

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.AssetDefinition = try {
                AssetDefinition(
                    AssetDefinitionEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.AssetDefinition,
            ): Unit = try {
                AssetDefinitionEvent.write(writer, instance.assetDefinitionEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Asset' variant
     */
    public data class Asset(
        public val assetEvent: AssetEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Asset>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Asset> {
            public const val DISCRIMINANT: Int = 4

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Asset = try {
                Asset(
                    AssetEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Asset,
            ): Unit = try {
                AssetEvent.write(writer, instance.assetEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Trigger' variant
     */
    public data class Trigger(
        public val triggerEvent: TriggerEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Trigger>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Trigger> {
            public const val DISCRIMINANT: Int = 5

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Trigger = try {
                Trigger(
                    TriggerEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Trigger,
            ): Unit = try {
                TriggerEvent.write(writer, instance.triggerEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Role' variant
     */
    public data class Role(
        public val roleEvent: RoleEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Role>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Role> {
            public const val DISCRIMINANT: Int = 6

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Role =
                try {
                    Role(
                        RoleEvent.read(reader),
                    )
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Role,
            ): Unit = try {
                RoleEvent.write(writer, instance.roleEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'PermissionToken' variant
     */
    public data class PermissionToken(
        public val permissionTokenSchemaUpdateEvent: PermissionTokenSchemaUpdateEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.PermissionToken>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.PermissionToken> {
            public const val DISCRIMINANT: Int = 7

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.PermissionToken = try {
                PermissionToken(
                    PermissionTokenSchemaUpdateEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.PermissionToken,
            ): Unit = try {
                PermissionTokenSchemaUpdateEvent.write(writer, instance.permissionTokenSchemaUpdateEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Configuration' variant
     */
    public data class Configuration(
        public val configurationEvent: ConfigurationEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Configuration>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Configuration> {
            public const val DISCRIMINANT: Int = 8

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Configuration = try {
                Configuration(
                    ConfigurationEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Configuration,
            ): Unit = try {
                ConfigurationEvent.write(writer, instance.configurationEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Validator' variant
     */
    public data class Validator(
        public val validatorEvent: ValidatorEvent,
    ) : DataEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.DataEvent.Validator>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.DataEvent.Validator> {
            public const val DISCRIMINANT: Int = 9

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.DataEvent.Validator = try {
                Validator(
                    ValidatorEvent.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.DataEvent.Validator,
            ): Unit = try {
                ValidatorEvent.write(writer, instance.validatorEvent)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<DataEvent>, ScaleWriter<DataEvent> {
        override fun read(reader: ScaleCodecReader): DataEvent = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> Peer.read(reader)
            1 -> Domain.read(reader)
            2 -> Account.read(reader)
            3 -> AssetDefinition.read(reader)
            4 -> Asset.read(reader)
            5 -> Trigger.read(reader)
            6 -> Role.read(reader)
            7 -> PermissionToken.read(reader)
            8 -> Configuration.read(reader)
            9 -> Validator.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: DataEvent) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Peer.write(writer, instance as Peer)
                1 -> Domain.write(writer, instance as Domain)
                2 -> Account.write(writer, instance as Account)
                3 -> AssetDefinition.write(writer, instance as AssetDefinition)
                4 -> Asset.write(writer, instance as Asset)
                5 -> Trigger.write(writer, instance as Trigger)
                6 -> Role.write(writer, instance as Role)
                7 -> PermissionToken.write(writer, instance as PermissionToken)
                8 -> Configuration.write(writer, instance as Configuration)
                9 -> Validator.write(writer, instance as Validator)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}
