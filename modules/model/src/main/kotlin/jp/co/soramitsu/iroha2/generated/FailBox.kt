//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.String
import kotlin.Unit

/**
 * FailBox
 *
 * Generated from 'FailBox' regular structure
 */
public data class FailBox(
    public val message: String,
) {
    public companion object : ScaleReader<FailBox>, ScaleWriter<FailBox> {
        override fun read(reader: ScaleCodecReader): FailBox = try {
            FailBox(
                reader.readString(),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: FailBox): Unit = try {
            writer.writeAsList(instance.message.toByteArray(Charsets.UTF_8))
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
