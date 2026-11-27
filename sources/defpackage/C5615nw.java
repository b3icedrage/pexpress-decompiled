package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5615nw implements InterfaceC4765jt1<ByteBuffer, C0988Fl0> {
    public static final a f = new a();
    public static final b g = new b();
    public final Context a;
    public final ArrayList b;
    public final b c;
    public final a d;
    public final C0832Dl0 e;

    /* JADX INFO: renamed from: nw$a */
    public static class a {
    }

    /* JADX INFO: renamed from: nw$b */
    public static class b {
        public final ArrayDeque a;

        public b() {
            char[] cArr = C6177qc2.a;
            this.a = new ArrayDeque(0);
        }

        public final synchronized void a(C1533Ml0 c1533Ml0) {
            c1533Ml0.b = null;
            c1533Ml0.c = null;
            this.a.offer(c1533Ml0);
        }
    }

    public C5615nw(Context context, ArrayList arrayList, InterfaceC0930Es interfaceC0930Es, OU0 ou0) {
        a aVar = f;
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = aVar;
        this.e = new C0832Dl0(interfaceC0930Es, ou0);
        this.c = g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.InterfaceC4765jt1
    public final defpackage.InterfaceC3667et1<defpackage.C0988Fl0> a(@androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9, int r10, @androidx.annotation.NonNull defpackage.C4227ha1 r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            nw$b r8 = r7.c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            Ml0 r0 = (defpackage.C1533Ml0) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            Ml0 r0 = new Ml0     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            Ll0 r0 = new Ll0     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.c = r0     // Catch: java.lang.Throwable -> L54
            r5.d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            Gl0 r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            nw$b r9 = r1.c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            nw$b r9 = r1.c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5615nw.a(java.lang.Object, int, int, ha1):et1");
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull ByteBuffer byteBuffer, @NonNull C4227ha1 c4227ha1) {
        return !((Boolean) c4227ha1.c(C1614Nl0.b)).booleanValue() && com.bumptech.glide.load.a.c(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public final C1066Gl0 c(ByteBuffer byteBuffer, int i, int i2, C1533Ml0 c1533Ml0, C4227ha1 c4227ha1) {
        boolean zIsLoggable;
        int i3 = C6562sS0.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C1456Ll0 c1456Ll0B = c1533Ml0.b();
            if (c1456Ll0B.c > 0 && c1456Ll0B.b == 0) {
                Bitmap.Config config = c4227ha1.c(C1614Nl0.a) == EnumC6357rU.e ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(c1456Ll0B.g / i2, c1456Ll0B.f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                Log.isLoggable("BufferGifDecoder", 2);
                a aVar = this.d;
                C0832Dl0 c0832Dl0 = this.e;
                aVar.getClass();
                C3774fP1 c3774fP1 = new C3774fP1(c0832Dl0, c1456Ll0B, byteBuffer, iMax);
                c3774fP1.d(config);
                c3774fP1.b();
                Bitmap bitmapA = c3774fP1.a();
                if (bitmapA != null) {
                    return new C1066Gl0(new C0988Fl0(new C0988Fl0.a(new C1300Jl0(com.bumptech.glide.a.a(this.a), c3774fP1, i, i2, K82.b, bitmapA))));
                }
                if (zIsLoggable) {
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
