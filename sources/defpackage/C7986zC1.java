package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7986zC1 implements InterfaceC7776yC1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C4612j90 b;

    @NotNull
    public final ReporterApi c;

    @NotNull
    public final InterfaceC7012ub2 d;

    /* JADX INFO: renamed from: zC1$a */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.usecases.SaveNicknameUseCaseBase$saveNickname$1", f = "SaveNicknameUseCaseBase.kt", l = {29}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, JM<? super a> jm) {
            super(2, jm);
            this.g = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C7986zC1.this.new a(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C7986zC1 c7986zC1 = C7986zC1.this;
                if (c7986zC1.a.k.getValue() != null) {
                    C4923kf c4923kf = c7986zC1.a;
                    if (c4923kf.c.getValue() != null) {
                        C6106qG c6106qG = (C6106qG) c4923kf.c.getValue();
                        String str = c6106qG != null ? c6106qG.b : null;
                        String str2 = this.g;
                        if (!Intrinsics.a(str, str2)) {
                            this.d = 1;
                            if (C7986zC1.b(c7986zC1, str2, this) == mn) {
                                return mn;
                            }
                        }
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public C7986zC1(@NotNull C4923kf appDataRepository, @NotNull C4612j90 eventsFlowsProvider, @NotNull ReporterApi reporter, @NotNull InterfaceC7012ub2 userRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.a = appDataRepository;
        this.b = eventsFlowsProvider;
        this.c = reporter;
        this.d = userRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        if (r0.a(r1, r3) == r4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.C7986zC1 r22, java.lang.String r23, defpackage.LM r24) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7986zC1.b(zC1, java.lang.String, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7776yC1
    public final void a(@NotNull String newNick) {
        Intrinsics.checkNotNullParameter(newNick, "newNick");
        C5189lv.k(C3286d41.a, C6266r20.c, new a(newNick, null), 2);
    }
}
