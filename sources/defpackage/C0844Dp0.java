package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Dp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0844Dp0 implements Closeable {

    @NotNull
    public static final Logger h;

    @NotNull
    public final C3024bo1 d;

    @NotNull
    public final b e;

    @NotNull
    public final C5172lp0.a g;

    /* JADX INFO: renamed from: Dp0$a */
    public static final class a {
        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(C4564j.c(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    static {
        Logger logger = Logger.getLogger(C6434rp0.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        h = logger;
    }

    public C0844Dp0(@NotNull C3024bo1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.d = source;
        b bVar = new b(source);
        this.e = bVar;
        this.g = new C5172lp0.a(bVar);
    }

    public final boolean c(boolean z, @NotNull C6644sp0.c handler) throws IOException {
        EnumC7967z70 errorCode;
        int iT;
        EnumC7967z70 errorCode2;
        Object[] array;
        C3024bo1 c3024bo1 = this.d;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            c3024bo1.C(9L);
            int iU = C6806tc2.u(c3024bo1);
            if (iU > 16384) {
                throw new IOException(EK.e(iU, "FRAME_SIZE_ERROR: "));
            }
            int iG = c3024bo1.g() & 255;
            byte bG = c3024bo1.g();
            int i = bG & 255;
            int iT2 = c3024bo1.t();
            int i2 = iT2 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Level level = Level.FINE;
            Logger logger = h;
            if (logger.isLoggable(level)) {
                C6434rp0.a.getClass();
                logger.fine(C6434rp0.a(true, i2, iU, iG, i));
            }
            if (z && iG != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                C6434rp0.a.getClass();
                String[] strArr = C6434rp0.c;
                sb.append(iG < strArr.length ? strArr[iG] : C6806tc2.j("0x%02x", Integer.valueOf(iG)));
                throw new IOException(sb.toString());
            }
            switch (iG) {
                case 0:
                    if (i2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (bG & 1) != 0;
                    if ((bG & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int iG2 = (8 & bG) != 0 ? c3024bo1.g() & 255 : 0;
                    handler.a(z2, i2, c3024bo1, a.a(iU, i, iG2));
                    c3024bo1.r(iG2);
                    return true;
                case 1:
                    if (i2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (bG & 1) != 0;
                    int iG3 = (8 & bG) != 0 ? c3024bo1.g() & 255 : 0;
                    if ((bG & 32) != 0) {
                        g(handler, i2);
                        iU -= 5;
                    }
                    handler.b(i2, f(a.a(iU, i, iG3), iG3, i, i2), z3);
                    return true;
                case 2:
                    if (iU != 5) {
                        throw new IOException(C1332Jw.a(iU, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i2 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    g(handler, i2);
                    return true;
                case 3:
                    if (iU != 4) {
                        throw new IOException(C1332Jw.a(iU, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i2 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iT3 = c3024bo1.t();
                    EnumC7967z70[] enumC7967z70ArrValues = EnumC7967z70.values();
                    int length = enumC7967z70ArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            errorCode = enumC7967z70ArrValues[i3];
                            if (errorCode.d != iT3) {
                                i3++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(EK.e(iT3, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    C6644sp0 c6644sp0 = handler.e;
                    c6644sp0.getClass();
                    if (i2 == 0 || (iT2 & 1) != 0) {
                        C0922Ep0 c0922Ep0K = c6644sp0.k(i2);
                        if (c0922Ep0K != null) {
                            c0922Ep0K.j(errorCode);
                        }
                        return true;
                    }
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    c6644sp0.m.c(new C0610Ap0(c6644sp0.g + '[' + i2 + "] onReset", c6644sp0, i2, errorCode), 0L);
                    return true;
                case 4:
                    if (i2 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((bG & 1) != 0) {
                        if (iU != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iU % 6 != 0) {
                        throw new IOException(EK.e(iU, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    C6536sJ1 settings = new C6536sJ1();
                    c cVarH = f.h(6, f.i(0, iU));
                    int i4 = cVarH.d;
                    int i5 = cVarH.e;
                    int i6 = cVarH.g;
                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                        while (true) {
                            short sV = c3024bo1.v();
                            byte[] bArr = C6806tc2.a;
                            int i7 = sV & 65535;
                            iT = c3024bo1.t();
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    i7 = 4;
                                } else if (i7 == 4) {
                                    if (iT < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i7 = 7;
                                } else if (i7 == 5 && (iT < 16384 || iT > 16777215)) {
                                }
                            } else if (iT != 0 && iT != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.c(i7, iT);
                            if (i4 != i5) {
                                i4 += i6;
                            }
                        }
                        throw new IOException(EK.e(iT, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                    }
                    Intrinsics.checkNotNullParameter(settings, "settings");
                    C6644sp0 c6644sp1 = handler.e;
                    c6644sp1.l.c(new C7485wp0(C5807oq.b(new StringBuilder(), c6644sp1.g, " applyAndAckSettings"), handler, settings), 0L);
                    return true;
                case 5:
                    if (i2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int iG4 = (bG & 8) != 0 ? c3024bo1.g() & 255 : 0;
                    handler.d(c3024bo1.t() & Api.BaseClientBuilder.API_PRIORITY_OTHER, f(a.a(iU - 4, i, iG4), iG4, i, i2));
                    return true;
                case 6:
                    if (iU != 8) {
                        throw new IOException(EK.e(iU, "TYPE_PING length != 8: "));
                    }
                    if (i2 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int iT4 = c3024bo1.t();
                    int iT5 = c3024bo1.t();
                    if ((bG & 1) == 0) {
                        handler.e.l.c(new C7274vp0(C5807oq.b(new StringBuilder(), handler.e.g, " ping"), handler.e, iT4, iT5), 0L);
                        return true;
                    }
                    C6644sp0 c6644sp2 = handler.e;
                    synchronized (c6644sp2) {
                        try {
                            if (iT4 == 1) {
                                c6644sp2.q++;
                            } else if (iT4 != 2) {
                                if (iT4 == 3) {
                                    c6644sp2.notifyAll();
                                }
                                Unit unit = Unit.a;
                            } else {
                                c6644sp2.s++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iU < 8) {
                        throw new IOException(EK.e(iU, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i2 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int iT6 = c3024bo1.t();
                    int iT7 = c3024bo1.t();
                    int i8 = iU - 8;
                    EnumC7967z70[] enumC7967z70ArrValues2 = EnumC7967z70.values();
                    int length2 = enumC7967z70ArrValues2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            errorCode2 = enumC7967z70ArrValues2[i9];
                            if (errorCode2.d != iT7) {
                                i9++;
                            }
                        } else {
                            errorCode2 = null;
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(EK.e(iT7, "TYPE_GOAWAY unexpected error code: "));
                    }
                    C1802Pw debugData = C1802Pw.h;
                    if (i8 > 0) {
                        debugData = c3024bo1.k(i8);
                    }
                    Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                    Intrinsics.checkNotNullParameter(debugData, "debugData");
                    debugData.f();
                    C6644sp0 c6644sp3 = handler.e;
                    synchronized (c6644sp3) {
                        array = c6644sp3.e.values().toArray(new C0922Ep0[0]);
                        c6644sp3.j = true;
                        Unit unit2 = Unit.a;
                    }
                    for (C0922Ep0 c0922Ep0 : (C0922Ep0[]) array) {
                        if (c0922Ep0.a > iT6 && c0922Ep0.g()) {
                            c0922Ep0.j(EnumC7967z70.REFUSED_STREAM);
                            handler.e.k(c0922Ep0.a);
                        }
                    }
                    return true;
                case 8:
                    if (iU != 4) {
                        throw new IOException(EK.e(iU, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long jT = ((long) c3024bo1.t()) & 2147483647L;
                    if (jT == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i2 == 0) {
                        C6644sp0 c6644sp4 = handler.e;
                        synchronized (c6644sp4) {
                            c6644sp4.z += jT;
                            c6644sp4.notifyAll();
                            Unit unit3 = Unit.a;
                        }
                        return true;
                    }
                    C0922Ep0 c0922Ep0G = handler.e.g(i2);
                    if (c0922Ep0G != null) {
                        synchronized (c0922Ep0G) {
                            c0922Ep0G.f += jT;
                            if (jT > 0) {
                                c0922Ep0G.notifyAll();
                            }
                            Unit unit4 = Unit.a;
                        }
                        return true;
                    }
                    return true;
                default:
                    c3024bo1.r(iU);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    public final List<C1932Rn0> f(int i, int i2, int i3, int i4) throws IOException {
        b bVar = this.e;
        bVar.i = i;
        bVar.e = i;
        bVar.j = i2;
        bVar.g = i3;
        bVar.h = i4;
        while (true) {
            C5172lp0.a aVar = this.g;
            C3024bo1 c3024bo1 = aVar.c;
            boolean zC = c3024bo1.c();
            ArrayList arrayList = aVar.b;
            if (zC) {
                List<C1932Rn0> listE0 = CollectionsKt.e0(arrayList);
                arrayList.clear();
                return listE0;
            }
            byte bG = c3024bo1.g();
            byte[] bArr = C6806tc2.a;
            int i5 = bG & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((bG & 128) == 128) {
                int iE = aVar.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    C1932Rn0[] c1932Rn0Arr = C5172lp0.a;
                    if (i6 <= c1932Rn0Arr.length - 1) {
                        arrayList.add(c1932Rn0Arr[i6]);
                    }
                }
                int length = aVar.e + 1 + (i6 - C5172lp0.a.length);
                if (length >= 0) {
                    C1932Rn0[] c1932Rn0Arr2 = aVar.d;
                    if (length < c1932Rn0Arr2.length) {
                        C1932Rn0 c1932Rn0 = c1932Rn0Arr2[length];
                        Intrinsics.checkNotNull(c1932Rn0);
                        arrayList.add(c1932Rn0);
                    }
                }
                throw new IOException(EK.e(iE, "Header index too large "));
            }
            if (i5 == 64) {
                C1932Rn0[] c1932Rn0Arr3 = C5172lp0.a;
                C1802Pw c1802PwD = aVar.d();
                C5172lp0.a(c1802PwD);
                aVar.c(new C1932Rn0(c1802PwD, aVar.d()));
            } else if ((bG & 64) == 64) {
                aVar.c(new C1932Rn0(aVar.b(aVar.e(i5, 63) - 1), aVar.d()));
            } else if ((bG & 32) == 32) {
                int iE2 = aVar.e(i5, 31);
                aVar.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + aVar.a);
                }
                int i7 = aVar.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        C1932Rn0[] c1932Rn0Arr4 = aVar.d;
                        C1371Kj.f(c1932Rn0Arr4, null, 0, c1932Rn0Arr4.length);
                        aVar.e = aVar.d.length - 1;
                        aVar.f = 0;
                        aVar.g = 0;
                    } else {
                        aVar.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C1932Rn0[] c1932Rn0Arr5 = C5172lp0.a;
                C1802Pw c1802PwD2 = aVar.d();
                C5172lp0.a(c1802PwD2);
                arrayList.add(new C1932Rn0(c1802PwD2, aVar.d()));
            } else {
                arrayList.add(new C1932Rn0(aVar.b(aVar.e(i5, 15) - 1), aVar.d()));
            }
        }
    }

    public final void g(C6644sp0.c cVar, int i) throws EOFException {
        C3024bo1 c3024bo1 = this.d;
        c3024bo1.t();
        c3024bo1.g();
        byte[] bArr = C6806tc2.a;
    }

    /* JADX INFO: renamed from: Dp0$b */
    public static final class b implements UN1 {

        @NotNull
        public final C3024bo1 d;
        public int e;
        public int g;
        public int h;
        public int i;
        public int j;

        public b(@NotNull C3024bo1 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.d = source;
        }

        @Override // defpackage.UN1
        @NotNull
        public final LZ1 o() {
            return this.d.d.o();
        }

        @Override // defpackage.UN1
        public final long s0(@NotNull C1481Lu sink, long j) throws IOException {
            int i;
            int iT;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i2 = this.i;
                C3024bo1 c3024bo1 = this.d;
                if (i2 == 0) {
                    c3024bo1.r(this.j);
                    this.j = 0;
                    if ((this.g & 4) == 0) {
                        i = this.h;
                        int iU = C6806tc2.u(c3024bo1);
                        this.i = iU;
                        this.e = iU;
                        int iG = c3024bo1.g() & 255;
                        this.g = c3024bo1.g() & 255;
                        Logger logger = C0844Dp0.h;
                        if (logger.isLoggable(Level.FINE)) {
                            C6434rp0 c6434rp0 = C6434rp0.a;
                            int i3 = this.h;
                            int i4 = this.e;
                            int i5 = this.g;
                            c6434rp0.getClass();
                            logger.fine(C6434rp0.a(true, i3, i4, iG, i5));
                        }
                        iT = c3024bo1.t() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        this.h = iT;
                        if (iG != 9) {
                            throw new IOException(iG + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long jS0 = c3024bo1.s0(sink, Math.min(j, i2));
                    if (jS0 != -1) {
                        this.i -= (int) jS0;
                        return jS0;
                    }
                }
                return -1L;
            } while (iT == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
