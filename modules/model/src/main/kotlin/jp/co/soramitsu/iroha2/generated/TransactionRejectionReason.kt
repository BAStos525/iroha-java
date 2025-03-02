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
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * TransactionRejectionReason
 *
 * Generated from 'TransactionRejectionReason' enum
 */
public sealed class TransactionRejectionReason : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    override fun equals(other: Any?): Boolean = when (this) {
        is UnexpectedGenesisAccountSignature -> UnexpectedGenesisAccountSignature.equals(this, other)
        is Expired -> Expired.equals(this, other)
        else -> super.equals(other) }

    override fun hashCode(): Int = when (this) {
        is UnexpectedGenesisAccountSignature -> UnexpectedGenesisAccountSignature.hashCode()
        is Expired -> Expired.hashCode()
        else -> super.hashCode() }

    /**
     * 'AccountDoesNotExist' variant
     */
    public data class AccountDoesNotExist(
        public val findError: FindError,
    ) : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.AccountDoesNotExist>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.AccountDoesNotExist> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.AccountDoesNotExist = try {
                AccountDoesNotExist(
                    FindError.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.AccountDoesNotExist,
            ): Unit = try {
                FindError.write(writer, instance.findError)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'LimitCheck' variant
     */
    public data class LimitCheck(
        public val transactionLimitError: TransactionLimitError,
    ) : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.LimitCheck>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.LimitCheck> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.LimitCheck = try {
                LimitCheck(
                    TransactionLimitError.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.LimitCheck,
            ): Unit =
                try {
                    TransactionLimitError.write(writer, instance.transactionLimitError)
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }
        }
    }

    /**
     * 'Validation' variant
     */
    public data class Validation(
        public val validationFail: ValidationFail,
    ) : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Validation>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Validation> {
            public const val DISCRIMINANT: Int = 2

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Validation = try {
                Validation(
                    ValidationFail.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Validation,
            ): Unit =
                try {
                    ValidationFail.write(writer, instance.validationFail)
                } catch (ex: Exception) {
                    throw wrapException(ex)
                }
        }
    }

    /**
     * 'InstructionExecution' variant
     */
    public data class InstructionExecution(
        public val instructionExecutionFail: InstructionExecutionFail,
    ) : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.InstructionExecution>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.InstructionExecution> {
            public const val DISCRIMINANT: Int = 3

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.InstructionExecution = try {
                InstructionExecution(
                    InstructionExecutionFail.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.InstructionExecution,
            ): Unit = try {
                InstructionExecutionFail.write(writer, instance.instructionExecutionFail)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'WasmExecution' variant
     */
    public data class WasmExecution(
        public val wasmExecutionFail: WasmExecutionFail,
    ) : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.WasmExecution>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.WasmExecution> {
            public const val DISCRIMINANT: Int = 4

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.WasmExecution = try {
                WasmExecution(
                    WasmExecutionFail.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.WasmExecution,
            ): Unit = try {
                WasmExecutionFail.write(writer, instance.wasmExecutionFail)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'UnexpectedGenesisAccountSignature' variant
     */
    public class UnexpectedGenesisAccountSignature : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.UnexpectedGenesisAccountSignature>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.UnexpectedGenesisAccountSignature> {
            public const val DISCRIMINANT: Int = 5

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.UnexpectedGenesisAccountSignature = try {
                UnexpectedGenesisAccountSignature()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.UnexpectedGenesisAccountSignature,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(
                o1: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.UnexpectedGenesisAccountSignature,
                o2: Any?,
            ): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int =
                ".TransactionRejectionReason.UnexpectedGenesisAccountSignature".hashCode()
        }
    }

    /**
     * 'Expired' variant
     */
    public class Expired : TransactionRejectionReason() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Expired>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Expired> {
            public const val DISCRIMINANT: Int = 6

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Expired = try {
                Expired()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Expired,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(
                o1: jp.co.soramitsu.iroha2.generated.TransactionRejectionReason.Expired,
                o2: Any?,
            ): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".TransactionRejectionReason.Expired".hashCode()
        }
    }

    public companion object :
        ScaleReader<TransactionRejectionReason>,
        ScaleWriter<TransactionRejectionReason> {
        override fun read(reader: ScaleCodecReader): TransactionRejectionReason = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> AccountDoesNotExist.read(reader)
            1 -> LimitCheck.read(reader)
            2 -> Validation.read(reader)
            3 -> InstructionExecution.read(reader)
            4 -> WasmExecution.read(reader)
            5 -> UnexpectedGenesisAccountSignature.read(reader)
            6 -> Expired.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: TransactionRejectionReason) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> AccountDoesNotExist.write(writer, instance as AccountDoesNotExist)
                1 -> LimitCheck.write(writer, instance as LimitCheck)
                2 -> Validation.write(writer, instance as Validation)
                3 -> InstructionExecution.write(writer, instance as InstructionExecution)
                4 -> WasmExecution.write(writer, instance as WasmExecution)
                5 -> UnexpectedGenesisAccountSignature.write(
                    writer,
                    instance as
                        UnexpectedGenesisAccountSignature,
                )
                6 -> Expired.write(writer, instance as Expired)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}
