package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6348rR {

    @NotNull
    public final InterfaceC0565Aa0 a;

    @NotNull
    public final InterfaceC3655ep1 b;

    @NotNull
    public final InterfaceC6396rf0<Boolean> c;

    /* JADX INFO: renamed from: rR$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: rR$a$a, reason: collision with other inner class name */
        public static final class C0482a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: rR$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.experiments.remote.custom_indicators.CustomIndicatorsExperimentProviderApi$special$$inlined$map$1$2", f = "CustomIndicatorsExperimentProviderApi.kt", l = {219}, m = "emit")
            public static final class C0483a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0483a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0482a.this.a(null, this);
                }
            }

            public C0482a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0483a c0483a;
                if (jm instanceof C0483a) {
                    c0483a = (C0483a) jm;
                    int i = c0483a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0483a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0483a = new C0483a(jm);
                    }
                } else {
                    c0483a = new C0483a(jm);
                }
                Object obj2 = c0483a.d;
                MN mn = MN.d;
                int i2 = c0483a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    AbstractC7427wa0 abstractC7427wa0 = (AbstractC7427wa0) obj;
                    AbstractC7427wa0.a aVar = abstractC7427wa0 instanceof AbstractC7427wa0.a ? (AbstractC7427wa0.a) abstractC7427wa0 : null;
                    boolean z = false;
                    if (aVar != null && aVar.b) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c0483a.e = 1;
                    if (this.d.a(boolValueOf, c0483a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0482a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C6348rR(@NotNull InterfaceC0565Aa0 experimentsProviderApi, @NotNull InterfaceC3655ep1 referralLinkUseCase) {
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        Intrinsics.checkNotNullParameter(referralLinkUseCase, "referralLinkUseCase");
        this.a = experimentsProviderApi;
        this.b = referralLinkUseCase;
        this.c = C4466ii.m(new a(experimentsProviderApi.a(EnumC7637xa0.CUSTOM_INDICATORS)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull LM lm) {
        C6139qR c6139qR;
        C6348rR c6348rR;
        if (lm instanceof C6139qR) {
            c6139qR = (C6139qR) lm;
            int i = c6139qR.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6139qR.h = i - Integer.MIN_VALUE;
            } else {
                c6139qR = new C6139qR(this, lm);
            }
        } else {
            c6139qR = new C6139qR(this, lm);
        }
        Object obj = c6139qR.e;
        MN mn = MN.d;
        int i2 = c6139qR.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c6139qR.d = this;
            c6139qR.h = 1;
            if (this.b.a(c6139qR) == mn) {
                return mn;
            }
            c6348rR = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6348rR = c6139qR.d;
            C1795Pt1.b(obj);
        }
        c6348rR.a.b(EnumC7637xa0.CUSTOM_INDICATORS, new AbstractC7427wa0.a('B'));
        return Unit.a;
    }
}
