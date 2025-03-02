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
 * ValidatorEvent
 *
 * Generated from 'ValidatorEvent' enum
 */
public sealed class ValidatorEvent : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    override fun equals(other: Any?): Boolean = when (this) {
        is Upgraded -> Upgraded.equals(this, other)
        else -> super.equals(other) }

    override fun hashCode(): Int = when (this) {
        is Upgraded -> Upgraded.hashCode()
        else -> super.hashCode() }

    /**
     * 'Upgraded' variant
     */
    public class Upgraded : ValidatorEvent() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.ValidatorEvent.Upgraded>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.ValidatorEvent.Upgraded> {
            public const val DISCRIMINANT: Int = 0

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.ValidatorEvent.Upgraded = try {
                Upgraded()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.ValidatorEvent.Upgraded,
            ): Unit = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: jp.co.soramitsu.iroha2.generated.ValidatorEvent.Upgraded, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            override fun hashCode(): Int = ".ValidatorEvent.Upgraded".hashCode()
        }
    }

    public companion object : ScaleReader<ValidatorEvent>, ScaleWriter<ValidatorEvent> {
        override fun read(reader: ScaleCodecReader): ValidatorEvent = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> Upgraded.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: ValidatorEvent) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Upgraded.write(writer, instance as Upgraded)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}
