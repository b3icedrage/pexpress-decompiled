package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2657a8 implements U7 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final O3 b;

    @NotNull
    public final InterfaceC4824k92 c;

    @NotNull
    public final L32 d;

    public C2657a8(@NotNull C4923kf appDataRepository, @NotNull O3 accountModeSelectionPreferenceUseCase, @NotNull InterfaceC4824k92 unsentBetIdsPreferenceUseCase, @NotNull L32 tradingRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(accountModeSelectionPreferenceUseCase, "accountModeSelectionPreferenceUseCase");
        Intrinsics.checkNotNullParameter(unsentBetIdsPreferenceUseCase, "unsentBetIdsPreferenceUseCase");
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        this.a = appDataRepository;
        this.b = accountModeSelectionPreferenceUseCase;
        this.c = unsentBetIdsPreferenceUseCase;
        this.d = tradingRepository;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x020c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01e7 -> B:78:0x01ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.U7
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(long r18, @org.jetbrains.annotations.NotNull defpackage.LM r20) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2657a8.a(long, LM):java.lang.Object");
    }
}
