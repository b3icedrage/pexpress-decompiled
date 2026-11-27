package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1611Nk0 implements InterfaceC1375Kk0 {

    @NotNull
    public final L32 a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final OM c;

    public C1611Nk0(@NotNull L32 tradingRepository, @NotNull C4923kf appDataRepository, @NotNull OM convertCurrency) {
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(convertCurrency, "convertCurrency");
        this.a = tradingRepository;
        this.b = appDataRepository;
        this.c = convertCurrency;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0132  */
    /* JADX WARN: Code duplicated, block: B:40:0x013e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d4 -> B:43:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0132 -> B:38:0x013a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.C1611Nk0 r19, com.api.core.backend.domain.models.responseModels.CommonMinMaxBet r20, defpackage.JM r21) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1611Nk0.a(Nk0, com.api.core.backend.domain.models.responseModels.CommonMinMaxBet, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1375Kk0
    @Nullable
    public final void c() {
        C5189lv.k(C3286d41.a, C6266r20.c, new C1530Mk0(this, null), 2);
    }
}
