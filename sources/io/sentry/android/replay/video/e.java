package io.sentry.android.replay.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.C1332Jw;
import defpackage.C2688aH1;
import defpackage.EK;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC3770fO0;
import defpackage.NG1;
import defpackage.SK;
import defpackage.XO0;
import io.sentry.android.replay.util.j;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class e {

    @NotNull
    public final C2688aH1 a;

    @NotNull
    public final a b;

    @NotNull
    public final Object c;

    @NotNull
    public final MediaCodec d;

    @NotNull
    public final Object e;

    @NotNull
    public final MediaCodec.BufferInfo f;

    @NotNull
    public final b g;

    @Nullable
    public Surface h;

    public e(C2688aH1 options, a muxerConfig) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.a = options;
        this.b = muxerConfig;
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.e;
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(enumC4403iP0, c.d);
        this.c = interfaceC3770fO0A;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) interfaceC3770fO0A.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        Intrinsics.checkNotNull(mediaCodecCreateByCodecName);
        this.d = mediaCodecCreateByCodecName;
        this.e = XO0.a(enumC4403iP0, new d(this));
        this.f = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.a.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.g = new b(absolutePath, muxerConfig.d);
    }

    public final void a(boolean z) {
        ByteBuffer encodedData;
        C2688aH1 c2688aH1 = this.a;
        if (c2688aH1.getSessionReplay().m) {
            c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        }
        MediaCodec mediaCodec = this.d;
        if (z) {
            if (c2688aH1.getSessionReplay().m) {
                c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            MediaCodec.BufferInfo bufferInfo = this.f;
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
                if (c2688aH1.getSessionReplay().m) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else {
                b bVar = this.g;
                if (iDequeueOutputBuffer == -2) {
                    if (bVar.c) {
                        throw new RuntimeException("format changed twice");
                    }
                    MediaFormat videoFormat = mediaCodec.getOutputFormat();
                    Intrinsics.checkNotNullExpressionValue(videoFormat, "getOutputFormat(...)");
                    if (c2688aH1.getSessionReplay().m) {
                        c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: encoder output format changed: " + videoFormat, new Object[0]);
                    }
                    Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
                    MediaMuxer mediaMuxer = bVar.b;
                    bVar.d = mediaMuxer.addTrack(videoFormat);
                    mediaMuxer.start();
                    bVar.c = true;
                } else if (iDequeueOutputBuffer < 0) {
                    if (c2688aH1.getSessionReplay().m) {
                        c2688aH1.getLogger().a(NG1.DEBUG, EK.e(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                    }
                } else {
                    if (outputBuffers == null || (encodedData = outputBuffers[iDequeueOutputBuffer]) == null) {
                        throw new RuntimeException(C1332Jw.a(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        if (c2688aH1.getSessionReplay().m) {
                            c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        }
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!bVar.c) {
                            throw new RuntimeException("muxer hasn't started");
                        }
                        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
                        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
                        int i = bVar.e;
                        bVar.e = i + 1;
                        long j = bVar.a * ((long) i);
                        bVar.f = j;
                        bufferInfo.presentationTimeUs = j;
                        bVar.b.writeSampleData(bVar.d, encodedData, bufferInfo);
                        if (c2688aH1.getSessionReplay().m) {
                            c2688aH1.getLogger().a(NG1.DEBUG, SK.b(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                        }
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (c2688aH1.getSessionReplay().m) {
                            if (z) {
                                c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                return;
                            } else {
                                c2688aH1.getLogger().a(NG1.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public final void b(@NotNull Bitmap image) {
        Surface surface;
        Canvas canvasLockCanvas;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.C(MANUFACTURER, Payload.SOURCE_XIAOMI, true)) {
            surface = this.h;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (StringsKt.C(MANUFACTURER, "motorola", true)) {
                surface = this.h;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                j.a aVar = j.a.SOC_MANUFACTURER;
                if (kotlin.text.d.i(j.a(aVar), "spreadtrum") || kotlin.text.d.i(j.a(aVar), "unisoc")) {
                    surface = this.h;
                    if (surface != null) {
                        canvasLockCanvas = surface.lockCanvas(null);
                    } else {
                        canvasLockCanvas = null;
                    }
                } else {
                    Surface surface2 = this.h;
                    if (surface2 != null) {
                        canvasLockCanvas = surface2.lockHardwareCanvas();
                    } else {
                        canvasLockCanvas = null;
                    }
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.h;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        a(false);
    }

    public final void c() {
        MediaCodec mediaCodec = this.d;
        try {
            a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = this.h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = this.g.b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            this.a.getLogger().d(NG1.DEBUG, "Failed to properly release video encoder", th);
        }
    }
}
