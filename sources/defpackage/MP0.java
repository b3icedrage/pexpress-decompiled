package defpackage;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MP0 implements OS1, C2943bS.b {

    @NotNull
    public static final MP0 d = new MP0();
    public static final MP0 e = new MP0();

    public static float d(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float e(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int f(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fD = d(((i >> 16) & 255) / 255.0f);
        float fD2 = d(((i >> 8) & 255) / 255.0f);
        float fD3 = d((i & 255) / 255.0f);
        float fD4 = d(((i2 >> 16) & 255) / 255.0f);
        float fD5 = d(((i2 >> 8) & 255) / 255.0f);
        float fD6 = d((i2 & 255) / 255.0f);
        float fA = BX.a(f3, f2, f, f2);
        float fA2 = BX.a(fD4, fD, f, fD);
        float fA3 = BX.a(fD5, fD2, f, fD2);
        float fA4 = BX.a(fD6, fD3, f, fD3);
        float fE = e(fA2) * 255.0f;
        float fE2 = e(fA3) * 255.0f;
        return Math.round(e(fA4) * 255.0f) | (Math.round(fE) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fE2) << 8);
    }

    public static final boolean g(@NotNull InterfaceC7394wP0.a isEquivalentTo, @NotNull InterfaceC7394wP0.a other) {
        Intrinsics.checkNotNullParameter(isEquivalentTo, "$this$isEquivalentTo");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.a(isEquivalentTo, other)) {
            return true;
        }
        return (isEquivalentTo instanceof InterfaceC7394wP0.a.c) && (other instanceof InterfaceC7394wP0.a.c);
    }

    @NotNull
    public static final Object h(@NotNull C5899pH mapData, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(mapData, "$this$mapData");
        Intrinsics.checkNotNullParameter(data, "data");
        List<Pair<LW0<? extends Object, ?>, Class<? extends Object>>> list = mapData.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair<LW0<? extends Object, ?>, Class<? extends Object>> pair = list.get(i);
            LW0<? extends Object, ?> lw0 = pair.d;
            if (pair.e.isAssignableFrom(data.getClass())) {
                if (lw0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                }
                if (lw0.a(data)) {
                    data = lw0.b(data);
                }
            }
        }
        return data;
    }

    @NotNull
    public static final InterfaceC8038zU i(@NotNull C5899pH requireDecoder, @NotNull Object data, @NotNull InterfaceC2833av source, @Nullable String str) {
        InterfaceC8038zU interfaceC8038zU;
        Intrinsics.checkNotNullParameter(requireDecoder, "$this$requireDecoder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(source, "source");
        List<InterfaceC8038zU> list = requireDecoder.d;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                interfaceC8038zU = null;
                break;
            }
            interfaceC8038zU = list.get(i);
            if (interfaceC8038zU.b(source)) {
                break;
            }
            i++;
        }
        InterfaceC8038zU interfaceC8038zU2 = interfaceC8038zU;
        if (interfaceC8038zU2 != null) {
            return interfaceC8038zU2;
        }
        throw new IllegalStateException(FK.c(data, "Unable to decode data. No decoder supports: ").toString());
    }

    @NotNull
    public static final InterfaceC5122lc0 j(@NotNull C5899pH requireFetcher, @NotNull Object data) {
        Pair<InterfaceC5122lc0<? extends Object>, Class<? extends Object>> pair;
        Intrinsics.checkNotNullParameter(requireFetcher, "$this$requireFetcher");
        Intrinsics.checkNotNullParameter(data, "data");
        List<Pair<InterfaceC5122lc0<? extends Object>, Class<? extends Object>>> list = requireFetcher.c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pair = null;
                break;
            }
            pair = list.get(i);
            Pair<InterfaceC5122lc0<? extends Object>, Class<? extends Object>> pair2 = pair;
            InterfaceC5122lc0<? extends Object> interfaceC5122lc0 = pair2.d;
            if (pair2.e.isAssignableFrom(data.getClass())) {
                if (interfaceC5122lc0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type coil.fetch.Fetcher<kotlin.Any>");
                }
                if (interfaceC5122lc0.a(data)) {
                    break;
                }
            }
            i++;
        }
        Pair<InterfaceC5122lc0<? extends Object>, Class<? extends Object>> pair3 = pair;
        if (pair3 == null) {
            throw new IllegalStateException(FK.c(data, "Unable to fetch data. No fetcher supports: ").toString());
        }
        InterfaceC5122lc0<? extends Object> interfaceC5122lc1 = pair3.d;
        if (interfaceC5122lc1 != null) {
            return interfaceC5122lc1;
        }
        throw new NullPointerException("null cannot be cast to non-null type coil.fetch.Fetcher<T>");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    @Nullable
    public static final Serializable k(@NotNull InterfaceC0942Ew interfaceC0942Ew, @NotNull LM lm) {
        C0708Bw c0708Bw;
        if (lm instanceof C0708Bw) {
            c0708Bw = (C0708Bw) lm;
            int i = c0708Bw.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0708Bw.e = i - Integer.MIN_VALUE;
            } else {
                c0708Bw = new C0708Bw(lm);
            }
        } else {
            c0708Bw = new C0708Bw(lm);
        }
        Object objF = c0708Bw.d;
        MN mn = MN.d;
        int i2 = c0708Bw.e;
        if (i2 == 0) {
            C1795Pt1.b(objF);
            c0708Bw.e = 1;
            objF = interfaceC0942Ew.f(Long.MAX_VALUE, c0708Bw);
            if (objF == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objF);
        }
        return C6621sj.n((C1098Gw) objF);
    }

    @Override // defpackage.OS1
    @Nullable
    public InterfaceC6013po1 b(@NotNull XY0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // defpackage.OS1
    public void c(@NotNull XY0 key, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // defpackage.C2943bS.b
    public Iterable r(Object obj) {
        IJ0<Object>[] ij0Arr = C5693oI0.h;
        return ((InterfaceC1490Lx) obj).a().u();
    }

    @Override // defpackage.OS1
    public void a(int i) {
    }
}
