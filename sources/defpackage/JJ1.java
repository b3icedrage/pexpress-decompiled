package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JJ1 extends C7576xG {

    @NotNull
    public final InterfaceC7385wM0 d;

    @NotNull
    public final InterfaceC6956uJ1 e;

    @NotNull
    public final AbstractC6505s91 f;

    @NotNull
    public final AbstractC6925u91 g;

    @NotNull
    public final InterfaceC1131Hh h;

    @NotNull
    public final InterfaceC6396rf0<Boolean> i;

    @NotNull
    public final InterfaceC6396rf0<Boolean> j;

    @NotNull
    public final a k;

    public static final class a implements InterfaceC6396rf0<UL0> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ RL0 e;

        /* JADX INFO: renamed from: JJ1$a$a, reason: collision with other inner class name */
        public static final class C0061a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ RL0 e;

            /* JADX INFO: renamed from: JJ1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.settings.screens.SettingsViewModelBase$special$$inlined$map$1$2", f = "SettingsViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0062a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0062a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0061a.this.a(null, this);
                }
            }

            public C0061a(InterfaceC6606sf0 interfaceC6606sf0, RL0 rl0) {
                this.d = interfaceC6606sf0;
                this.e = rl0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0062a c0062a;
                T next;
                if (jm instanceof C0062a) {
                    c0062a = (C0062a) jm;
                    int i = c0062a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0062a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0062a = new C0062a(jm);
                    }
                } else {
                    c0062a = new C0062a(jm);
                }
                Object obj2 = c0062a.d;
                MN mn = MN.d;
                int i2 = c0062a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    String str = (String) obj;
                    RL0 rl0 = this.e;
                    Iterator<T> it = rl0.b().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.a(((UL0) next).g, str));
                    UL0 ul0DefaultValue = next;
                    if (ul0DefaultValue == null) {
                        ul0DefaultValue = rl0.defaultValue();
                    }
                    c0062a.e = 1;
                    if (this.d.a(ul0DefaultValue, c0062a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(InterfaceC6396rf0 interfaceC6396rf0, RL0 rl0) {
            this.d = interfaceC6396rf0;
            this.e = rl0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super UL0> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0061a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public JJ1(@NotNull RL0 languages, @NotNull InterfaceC7385wM0 lastOpenScreenProvider, @NotNull InterfaceC6956uJ1 settingsCallbacks, @NotNull AbstractC6505s91 oneClickDealsUseCase, @NotNull AbstractC6925u91 oneClickStopRobotUseCase, @NotNull ZL0 languageUseCase, @NotNull InterfaceC1131Hh appRepositoryApi) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(lastOpenScreenProvider, "lastOpenScreenProvider");
        Intrinsics.checkNotNullParameter(settingsCallbacks, "settingsCallbacks");
        Intrinsics.checkNotNullParameter(oneClickDealsUseCase, "oneClickDealsUseCase");
        Intrinsics.checkNotNullParameter(oneClickStopRobotUseCase, "oneClickStopRobotUseCase");
        Intrinsics.checkNotNullParameter(languageUseCase, "languageUseCase");
        Intrinsics.checkNotNullParameter(appRepositoryApi, "appRepositoryApi");
        this.d = lastOpenScreenProvider;
        this.e = settingsCallbacks;
        this.f = oneClickDealsUseCase;
        this.g = oneClickStopRobotUseCase;
        this.h = appRepositoryApi;
        this.i = oneClickDealsUseCase.l();
        this.j = oneClickStopRobotUseCase.l();
        this.k = new a(languageUseCase.l(), languages);
    }
}
