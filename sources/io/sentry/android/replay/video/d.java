package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import defpackage.C2688aH1;
import defpackage.ML0;
import defpackage.NG1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends ML0 implements Function0<MediaFormat> {
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(0);
        this.d = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MediaFormat invoke() {
        e eVar = this.d;
        a aVar = eVar.b;
        C2688aH1 c2688aH1 = eVar.a;
        int iIntValue = aVar.e;
        try {
            MediaCodecInfo codecInfo = eVar.d.getCodecInfo();
            aVar.getClass();
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecInfo.getCapabilitiesForType("video/avc").getVideoCapabilities();
            if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                c2688aH1.getLogger().a(NG1.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                Intrinsics.checkNotNullExpressionValue(objClamp, "clamp(...)");
                iIntValue = ((Number) objClamp).intValue();
            }
        } catch (Throwable th) {
            c2688aH1.getLogger().d(NG1.DEBUG, "Could not retrieve MediaCodec info", th);
        }
        aVar.getClass();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", aVar.b, aVar.c);
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
        mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar.d);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
        return mediaFormatCreateVideoFormat;
    }
}
