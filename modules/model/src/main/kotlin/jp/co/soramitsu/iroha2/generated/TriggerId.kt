//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Unit

/**
 * TriggerId
 *
 * Generated from 'TriggerId' regular structure
 */
public data class TriggerId(
    public val name: Name,
    public val domainId: DomainId? = null,
) {
    public companion object : ScaleReader<TriggerId>, ScaleWriter<TriggerId> {
        override fun read(reader: ScaleCodecReader): TriggerId = try {
            TriggerId(
                Name.read(reader),
                reader.readNullable(DomainId) as DomainId?,
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        override fun write(writer: ScaleCodecWriter, instance: TriggerId): Unit = try {
            Name.write(writer, instance.name)
            writer.writeNullable(DomainId, instance.domainId)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
