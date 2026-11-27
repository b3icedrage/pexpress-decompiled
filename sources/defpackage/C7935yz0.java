package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7935yz0 {
    @Nullable
    public static final C7725xz0 a(@NotNull InterfaceC7722xy0<?> interfaceC7722xy0) {
        Intrinsics.checkNotNullParameter(interfaceC7722xy0, "<this>");
        if (interfaceC7722xy0 instanceof XU0.a) {
            XU0.a aVar = (XU0.a) interfaceC7722xy0;
            return new C7725xz0("MACD", CR0.MACD, WE.f(new C1027Fy0("MACD line", "#21bf76", WE.f(new C3471dy0(EnumC7224vc0.d, Integer.valueOf(aVar.a), 1, 60), new C3471dy0(EnumC7224vc0.e, Integer.valueOf(aVar.b), 1, 60))), new C1027Fy0("Signal", "#f47961", VE.c(new C3471dy0(EnumC7224vc0.g, Integer.valueOf(aVar.c), 1, 60))), new C1027Fy0("Histogram", "#235ff8", C5653o60.d)));
        }
        if (interfaceC7722xy0 instanceof C6977uQ1.a) {
            C6977uQ1.a aVar2 = (C6977uQ1.a) interfaceC7722xy0;
            return new C7725xz0("Stochastic", CR0.Stochastic, WE.f(new C1027Fy0("%K", "#235ff8", VE.c(new C3471dy0(EnumC7224vc0.h, Integer.valueOf(aVar2.a), 1, 100))), new C1027Fy0("%D", "#f47961", VE.c(new C3471dy0(EnumC7224vc0.i, Integer.valueOf(aVar2.b), 1, 100))), new C1027Fy0("m", "#98A4B3", VE.c(new C3471dy0(EnumC7224vc0.j, Integer.valueOf(aVar2.c), 2, 100)))));
        }
        if (interfaceC7722xy0 instanceof C3863fp.a) {
            C3863fp.a aVar3 = (C3863fp.a) interfaceC7722xy0;
            return new C7725xz0("Bollinger Bands", CR0.BBands, WE.f(new C1027Fy0("SMA", "#f47961", VE.c(new C3471dy0(EnumC7224vc0.k, Integer.valueOf(aVar3.a), 2, 60))), new C1027Fy0("Standard deviation", "#ef9f0a", VE.c(new C3471dy0(EnumC7224vc0.l, Double.valueOf(aVar3.b), 1, 3)))));
        }
        if (interfaceC7722xy0 instanceof C4065gm1.a) {
            return new C7725xz0("RSI", CR0.Rsi, VE.c(new C1027Fy0("RSI", "#776bf8", VE.c(new C3471dy0(EnumC7224vc0.k, Integer.valueOf(((C4065gm1.a) interfaceC7722xy0).a), 2, 45)))));
        }
        if (!(interfaceC7722xy0 instanceof C2534Yw.a)) {
            return null;
        }
        return new C7725xz0("CCI", CR0.CCI, VE.c(new C1027Fy0("CCI", "#21bf76", VE.c(new C3471dy0(EnumC7224vc0.k, Integer.valueOf(((C2534Yw.a) interfaceC7722xy0).a), 3, HttpPlatformResponse.MAX_MESSAGE_LENGTH)))));
    }
}
