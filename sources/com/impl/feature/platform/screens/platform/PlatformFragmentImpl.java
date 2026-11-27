package com.impl.feature.platform.screens.platform;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.v;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.A0;
import defpackage.AW1;
import defpackage.AbstractC2140Ue1;
import defpackage.AbstractC4456if1;
import defpackage.C1280Je1;
import defpackage.C1621Nn1;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C1952Ru;
import defpackage.C2017Sp1;
import defpackage.C2137Ud1;
import defpackage.C2151Ui0;
import defpackage.C2649a6;
import defpackage.C2765af1;
import defpackage.C2767ag;
import defpackage.C3342dL0;
import defpackage.C3408df1;
import defpackage.C4;
import defpackage.C4247hf1;
import defpackage.C4466ii;
import defpackage.C4612j90;
import defpackage.C4733jk;
import defpackage.C4795k21;
import defpackage.C4923kf;
import defpackage.C5189lv;
import defpackage.C5500nO;
import defpackage.C5974pe1;
import defpackage.C6120qK1;
import defpackage.C6184qe1;
import defpackage.C6381rb1;
import defpackage.C6542sL1;
import defpackage.C7652xe;
import defpackage.Ch2;
import defpackage.ED;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.IA;
import defpackage.IW;
import defpackage.InterfaceC2297Wd1;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC3985gQ;
import defpackage.InterfaceC5910pK1;
import defpackage.InterfaceC6606sf0;
import defpackage.InterfaceC6856tq;
import defpackage.JM;
import defpackage.KN;
import defpackage.LE;
import defpackage.LM;
import defpackage.MN;
import defpackage.Pa2;
import defpackage.R40;
import defpackage.R51;
import defpackage.Sd2;
import defpackage.X5;
import defpackage.XO0;
import defpackage.Y5;
import defpackage.Z5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/impl/feature/platform/screens/platform/PlatformFragmentImpl;", "Lcom/base/feature/platform/screens/platform_webview/PlatformFragmentBase;", "Laf1;", R51.PUSH_ADDITIONAL_DATA_KEY, "FeaturePlatformImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformFragmentImpl extends PlatformFragmentBase<C2765af1> {
    public static final long E;
    public static final long F;
    public static final long G;
    public static final /* synthetic */ int H = 0;

    @NotNull
    public final InterfaceC3985gQ A;
    public boolean B;
    public boolean C;

    @NotNull
    public final C4795k21 D;

    @NotNull
    public final Sd2 t;

    @NotNull
    public final C2137Ud1 u;

    @NotNull
    public final Pa2 v;

    @NotNull
    public final InterfaceC2297Wd1 w;

    @NotNull
    public final C3408df1 x;

    @NotNull
    public final C4923kf y;

    @NotNull
    public final C4612j90 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("NONE", 0);
            d = aVar;
            a aVar2 = new a("SWITCHED", 1);
            e = aVar2;
            a aVar3 = new a("LOADING", 2);
            g = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            h = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$1", f = "PlatformFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1699On1 g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$1$1", f = "PlatformFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1699On1 g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$b$a$a, reason: collision with other inner class name */
            public static final class C0323a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ PlatformFragmentImpl e;

                public C0323a(KN kn, PlatformFragmentImpl platformFragmentImpl) {
                    this.e = platformFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PlatformFragmentImpl platformFragmentImpl = this.e;
                    platformFragmentImpl.C = zBooleanValue;
                    platformFragmentImpl.E();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1699On1 c1699On1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = c1699On1;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0323a c0323a = new C0323a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.d.c(c0323a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FP0 fp0, C1699On1 c1699On1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = c1699On1;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$2", f = "PlatformFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$2$1", f = "PlatformFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$c$a$a, reason: collision with other inner class name */
            public static final class C0324a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ PlatformFragmentImpl e;

                /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$c$a$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$2$1$1", f = "PlatformFragmentImpl.kt", l = {57, 52}, m = "emit")
                public static final class C0325a extends LM {
                    public /* synthetic */ Object d;
                    public int e;
                    public Object h;
                    public C4795k21 i;

                    public C0325a(JM jm) {
                        super(jm);
                    }

                    @Override // defpackage.AbstractC7487wq
                    public final Object invokeSuspend(Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return C0324a.this.a(null, this);
                    }
                }

                public C0324a(KN kn, PlatformFragmentImpl platformFragmentImpl) {
                    this.e = platformFragmentImpl;
                    this.d = kn;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
                
                    if (r8.D(r0) == r1) goto L26;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v1, types: [h21] */
                /* JADX WARN: Type inference failed for: r7v12 */
                /* JADX WARN: Type inference failed for: r7v13 */
                /* JADX WARN: Type inference failed for: r7v6, types: [h21] */
                @Override // defpackage.InterfaceC6606sf0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r7, defpackage.JM r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.impl.feature.platform.screens.platform.PlatformFragmentImpl.c.a.C0324a.C0325a
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.impl.feature.platform.screens.platform.PlatformFragmentImpl$c$a$a$a r0 = (com.impl.feature.platform.screens.platform.PlatformFragmentImpl.c.a.C0324a.C0325a) r0
                        int r1 = r0.e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.e = r1
                        goto L18
                    L13:
                        com.impl.feature.platform.screens.platform.PlatformFragmentImpl$c$a$a$a r0 = new com.impl.feature.platform.screens.platform.PlatformFragmentImpl$c$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.d
                        MN r1 = defpackage.MN.d
                        int r2 = r0.e
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L43
                        if (r2 == r4) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.h
                        h21 r7 = (defpackage.InterfaceC4117h21) r7
                        defpackage.C1795Pt1.b(r8)     // Catch: java.lang.Throwable -> L2f
                        goto L6b
                    L2f:
                        r8 = move-exception
                        goto L73
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        k21 r7 = r0.i
                        java.lang.Object r2 = r0.h
                        com.impl.feature.platform.screens.platform.PlatformFragmentImpl$c$a$a r2 = (com.impl.feature.platform.screens.platform.PlatformFragmentImpl.c.a.C0324a) r2
                        defpackage.C1795Pt1.b(r8)
                        goto L5a
                    L43:
                        defpackage.C1795Pt1.b(r8)
                        java.lang.String r7 = (java.lang.String) r7
                        com.impl.feature.platform.screens.platform.PlatformFragmentImpl r7 = r6.e
                        k21 r7 = r7.D
                        r0.h = r6
                        r0.i = r7
                        r0.e = r4
                        java.lang.Object r8 = r7.a(r0)
                        if (r8 != r1) goto L59
                        goto L6a
                    L59:
                        r2 = r6
                    L5a:
                        com.impl.feature.platform.screens.platform.PlatformFragmentImpl r8 = r2.e     // Catch: java.lang.Throwable -> L2f
                        r0.h = r7     // Catch: java.lang.Throwable -> L2f
                        r0.i = r5     // Catch: java.lang.Throwable -> L2f
                        r0.e = r3     // Catch: java.lang.Throwable -> L2f
                        int r2 = com.impl.feature.platform.screens.platform.PlatformFragmentImpl.H     // Catch: java.lang.Throwable -> L2f
                        java.lang.Enum r8 = r8.D(r0)     // Catch: java.lang.Throwable -> L2f
                        if (r8 != r1) goto L6b
                    L6a:
                        return r1
                    L6b:
                        kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L2f
                        r7.b(r5)
                        kotlin.Unit r7 = kotlin.Unit.a
                        return r7
                    L73:
                        r7.b(r5)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.impl.feature.platform.screens.platform.PlatformFragmentImpl.c.a.C0324a.a(java.lang.Object, JM):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0324a c0324a = new C0324a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0324a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$3", f = "PlatformFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1621Nn1 g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$3$1", f = "PlatformFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1621Nn1 g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$d$a$a, reason: collision with other inner class name */
            public static final class C0326a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ PlatformFragmentImpl e;

                public C0326a(KN kn, PlatformFragmentImpl platformFragmentImpl) {
                    this.e = platformFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    Object obj2 = this.e.i;
                    Intrinsics.checkNotNull(obj2);
                    ((C2765af1) obj2).l();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1621Nn1 c1621Nn1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = c1621Nn1;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0326a c0326a = new C0326a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.d.c(c0326a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FP0 fp0, C1621Nn1 c1621Nn1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = c1621Nn1;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new d(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$4", f = "PlatformFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C4733jk g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$4$1", f = "PlatformFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C4733jk g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$e$a$a, reason: collision with other inner class name */
            public static final class C0327a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ PlatformFragmentImpl e;

                public C0327a(KN kn, PlatformFragmentImpl platformFragmentImpl) {
                    this.e = platformFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    ((Boolean) obj).getClass();
                    Object obj2 = this.e.i;
                    Intrinsics.checkNotNull(obj2);
                    ((C2765af1) obj2).l();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4733jk c4733jk, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = c4733jk;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0327a c0327a = new C0327a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0327a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FP0 fp0, C4733jk c4733jk, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = c4733jk;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new e(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$5", f = "PlatformFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C1621Nn1 g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$5$1", f = "PlatformFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C1621Nn1 g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$f$a$a, reason: collision with other inner class name */
            public static final class C0328a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ PlatformFragmentImpl e;

                public C0328a(KN kn, PlatformFragmentImpl platformFragmentImpl) {
                    this.e = platformFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    if (((C4612j90.b) obj) == C4612j90.b.e) {
                        Object obj2 = this.e.i;
                        Intrinsics.checkNotNull(obj2);
                        ((C2765af1) obj2).l();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1621Nn1 c1621Nn1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = c1621Nn1;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0328a c0328a = new C0328a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.d.c(c0328a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FP0 fp0, C1621Nn1 c1621Nn1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = c1621Nn1;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new f(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$default$1", f = "PlatformFragmentImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ C6120qK1 g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectIn$default$1$1", f = "PlatformFragmentImpl.kt", l = {49}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ C6120qK1 g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$g$a$a, reason: collision with other inner class name */
            public static final class C0329a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ PlatformFragmentImpl e;

                public C0329a(KN kn, PlatformFragmentImpl platformFragmentImpl) {
                    this.e = platformFragmentImpl;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    Object obj2 = this.e.i;
                    Intrinsics.checkNotNull(obj2);
                    ((C2765af1) obj2).l();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6120qK1 c6120qK1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = c6120qK1;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) throws Throwable {
                MN mn = MN.d;
                int i = this.d;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                    return Unit.a;
                }
                C1795Pt1.b(obj);
                C0329a c0329a = new C0329a((KN) this.e, this.h);
                this.d = 1;
                this.g.c(c0329a, this);
                return mn;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FP0 fp0, C6120qK1 c6120qK1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = c6120qK1;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new g(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.h, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectLatestIn$1", f = "PlatformFragmentImpl.kt", l = {81}, m = "invokeSuspend")
    public static final class h extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ AbstractC2140Ue1.c g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectLatestIn$1$1", f = "PlatformFragmentImpl.kt", l = {82}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ AbstractC2140Ue1.c g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$h$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectLatestIn$1$1$1", f = "PlatformFragmentImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
            public static final class C0330a extends AW1 implements Function2<C6542sL1, JM<? super Unit>, Object> {
                public int d;
                public /* synthetic */ Object e;
                public final /* synthetic */ KN g;
                public final /* synthetic */ PlatformFragmentImpl h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0330a(KN kn, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                    super(2, jm);
                    this.h = platformFragmentImpl;
                    this.g = kn;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    C0330a c0330a = new C0330a(this.g, jm, this.h);
                    c0330a.e = obj;
                    return c0330a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(C6542sL1 c6542sL1, JM<? super Unit> jm) {
                    return ((C0330a) create(c6542sL1, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    MN mn = MN.d;
                    int i = this.d;
                    if (i == 0) {
                        C1795Pt1.b(obj);
                        C6542sL1 c6542sL1 = (C6542sL1) this.e;
                        if (c6542sL1 != null) {
                            this.d = 1;
                            if (PlatformFragmentImpl.B(this.h, c6542sL1, false, this) == mn) {
                                return mn;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC2140Ue1.c cVar, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = cVar;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0330a c0330a = new C0330a((KN) this.e, null, this.h);
                    this.d = 1;
                    if (C4466ii.j(this.g, c0330a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FP0 fp0, AbstractC2140Ue1.c cVar, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = cVar;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new h(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((h) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectLatestIn$2", f = "PlatformFragmentImpl.kt", l = {81}, m = "invokeSuspend")
    public static final class i extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ PlatformFragmentImpl h;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectLatestIn$2$1", f = "PlatformFragmentImpl.kt", l = {82}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ PlatformFragmentImpl h;

            /* JADX INFO: renamed from: com.impl.feature.platform.screens.platform.PlatformFragmentImpl$i$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$initLiveData$$inlined$launchAndCollectLatestIn$2$1$1", f = "PlatformFragmentImpl.kt", l = {85}, m = "invokeSuspend")
            public static final class C0331a extends AW1 implements Function2<C6542sL1, JM<? super Unit>, Object> {
                public int d;
                public /* synthetic */ Object e;
                public final /* synthetic */ KN g;
                public final /* synthetic */ PlatformFragmentImpl h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0331a(KN kn, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                    super(2, jm);
                    this.h = platformFragmentImpl;
                    this.g = kn;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    C0331a c0331a = new C0331a(this.g, jm, this.h);
                    c0331a.e = obj;
                    return c0331a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(C6542sL1 c6542sL1, JM<? super Unit> jm) {
                    return ((C0331a) create(c6542sL1, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    MN mn = MN.d;
                    int i = this.d;
                    if (i == 0) {
                        C1795Pt1.b(obj);
                        C6542sL1 c6542sL1 = (C6542sL1) this.e;
                        this.d = 1;
                        if (PlatformFragmentImpl.B(this.h, c6542sL1, true, this) == mn) {
                            return mn;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                a aVar = new a(this.g, jm, this.h);
                aVar.e = obj;
                return aVar;
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
                    C0331a c0331a = new C0331a((KN) this.e, null, this.h);
                    this.d = 1;
                    if (C4466ii.j(this.g, c0331a, this) == mn) {
                        return mn;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, PlatformFragmentImpl platformFragmentImpl) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = platformFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new i(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((i) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                a aVar = new a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, androidx.lifecycle.g.b.g, aVar, this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$onViewCreated$2$1", f = "PlatformFragmentImpl.kt", l = {}, m = "invokeSuspend")
    public static final class j extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public j(JM<? super j> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return PlatformFragmentImpl.this.new j(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((j) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3408df1 c3408df1 = PlatformFragmentImpl.this.x;
            c3408df1.getClass();
            C6381rb1.a aVar = C6381rb1.a.e;
            C6381rb1 c6381rb1 = c3408df1.u;
            c6381rb1.a(aVar, c6381rb1.g);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$onViewCreated$3$1", f = "PlatformFragmentImpl.kt", l = {}, m = "invokeSuspend")
    public static final class k extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public k(JM<? super k> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return PlatformFragmentImpl.this.new k(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((k) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3408df1 c3408df1 = PlatformFragmentImpl.this.x;
            c3408df1.getClass();
            C6381rb1.a aVar = C6381rb1.a.g;
            C6381rb1 c6381rb1 = c3408df1.u;
            c6381rb1.a(aVar, c6381rb1.g);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$onViewCreated$4$1", f = "PlatformFragmentImpl.kt", l = {96}, m = "invokeSuspend")
    public static final class l extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public l(JM<? super l> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return PlatformFragmentImpl.this.new l(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((l) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                PlatformFragmentImpl platformFragmentImpl = PlatformFragmentImpl.this;
                this.d = 1;
                if (platformFragmentImpl.w.a(this) == mn) {
                    return mn;
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

    @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$onViewCreated$5", f = "PlatformFragmentImpl.kt", l = {103}, m = "invokeSuspend")
    public static final class m extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        @InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl$onViewCreated$5$1", f = "PlatformFragmentImpl.kt", l = {106}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ PlatformFragmentImpl e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlatformFragmentImpl platformFragmentImpl, JM<? super a> jm) {
                super(2, jm);
                this.e = platformFragmentImpl;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                ((a) create(kn, jm)).invokeSuspend(Unit.a);
                return MN.d;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                C3408df1 c3408df1 = this.e.x;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1795Pt1.b(obj);
                        throw new C3342dL0();
                    }
                    C1795Pt1.b(obj);
                    C6381rb1 c6381rb1 = c3408df1.u;
                    if (!c6381rb1.i) {
                        c6381rb1.i = true;
                        c6381rb1.c();
                    }
                    this.d = 1;
                    IW.a(this);
                    return mn;
                } catch (Throwable th) {
                    C6381rb1 c6381rb2 = c3408df1.u;
                    if (c6381rb2.i) {
                        c6381rb2.i = false;
                        c6381rb2.c();
                    }
                    throw th;
                }
            }
        }

        public m(JM<? super m> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return PlatformFragmentImpl.this.new m(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((m) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                PlatformFragmentImpl platformFragmentImpl = PlatformFragmentImpl.this;
                FP0 viewLifecycleOwner = platformFragmentImpl.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.g.b bVar = androidx.lifecycle.g.b.i;
                a aVar = new a(platformFragmentImpl, null);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(viewLifecycleOwner, bVar, aVar, this) == mn) {
                    return mn;
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

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        R40 r40 = R40.SECONDS;
        E = kotlin.time.c.g(3, r40);
        F = kotlin.time.c.g(10, r40);
        G = kotlin.time.c.g(10, r40);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull C2137Ud1 binding, @NotNull Pa2 urlsProvider, @NotNull InterfaceC2297Wd1 platformCallbacks, @NotNull C1280Je1 resourceProvider, @NotNull Ch2 webViewCustomizer, @NotNull C3408df1 webChromeClient, @NotNull AbstractC4456if1 webViewClient, @NotNull ReporterApi reporter, @NotNull C4923kf appDataRepository, @NotNull C4612j90 eventsFlowsProvider, @NotNull InterfaceC3985gQ cryptoEnablementProvider) {
        super(platformCallbacks, binding, resourceProvider, webViewCustomizer, webChromeClient, webViewClient, reporter);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(urlsProvider, "urlsProvider");
        Intrinsics.checkNotNullParameter(platformCallbacks, "platformCallbacks");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(webChromeClient, "webChromeClient");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(cryptoEnablementProvider, "cryptoEnablementProvider");
        this.t = viewModelFactory;
        this.u = binding;
        this.v = urlsProvider;
        this.w = platformCallbacks;
        this.x = webChromeClient;
        this.y = appDataRepository;
        this.z = eventsFlowsProvider;
        this.A = cryptoEnablementProvider;
        this.D = ED.c();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:54:0x011b, B:19:0x004e, B:51:0x0108, B:23:0x0064, B:43:0x00d5, B:26:0x0071, B:36:0x00b2, B:40:0x00be, B:46:0x00e8, B:47:0x00ed, B:48:0x00ee), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: all -> 0x0043, PHI: r2 r10 r11 r12
      0x00d5: PHI (r2v7 com.impl.feature.platform.screens.platform.PlatformFragmentImpl) = 
      (r2v5 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
      (r2v8 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
     binds: [B:41:0x00d1, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r10v11 boolean) = (r10v8 boolean), (r10v12 boolean) binds: [B:41:0x00d1, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r11v8 h21) = (r11v6 h21), (r11v9 h21) binds: [B:41:0x00d1, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r12v6 ??) = (r12v28 ??), (r12v29 ??) binds: [B:41:0x00d1, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:54:0x011b, B:19:0x004e, B:51:0x0108, B:23:0x0064, B:43:0x00d5, B:26:0x0071, B:36:0x00b2, B:40:0x00be, B:46:0x00e8, B:47:0x00ed, B:48:0x00ee), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:54:0x011b, B:19:0x004e, B:51:0x0108, B:23:0x0064, B:43:0x00d5, B:26:0x0071, B:36:0x00b2, B:40:0x00be, B:46:0x00e8, B:47:0x00ed, B:48:0x00ee), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:54:0x011b, B:19:0x004e, B:51:0x0108, B:23:0x0064, B:43:0x00d5, B:26:0x0071, B:36:0x00b2, B:40:0x00be, B:46:0x00e8, B:47:0x00ed, B:48:0x00ee), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108 A[Catch: all -> 0x0043, PHI: r2 r10 r11 r12
      0x0108: PHI (r2v10 com.impl.feature.platform.screens.platform.PlatformFragmentImpl) = 
      (r2v5 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
      (r2v11 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
     binds: [B:49:0x0104, B:19:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r10v14 boolean) = (r10v8 boolean), (r10v15 boolean) binds: [B:49:0x0104, B:19:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r11v11 h21) = (r11v6 h21), (r11v12 h21) binds: [B:49:0x0104, B:19:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r12v9 ??) = (r12v26 ??), (r12v27 ??) binds: [B:49:0x0104, B:19:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:54:0x011b, B:19:0x004e, B:51:0x0108, B:23:0x0064, B:43:0x00d5, B:26:0x0071, B:36:0x00b2, B:40:0x00be, B:46:0x00e8, B:47:0x00ed, B:48:0x00ee), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b A[Catch: all -> 0x0043, PHI: r2 r10 r11 r12
      0x011b: PHI (r2v12 com.impl.feature.platform.screens.platform.PlatformFragmentImpl) = 
      (r2v5 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
      (r2v7 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
      (r2v10 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
      (r2v13 com.impl.feature.platform.screens.platform.PlatformFragmentImpl)
     binds: [B:37:0x00b8, B:44:0x00e4, B:52:0x0117, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r10v16 boolean) = (r10v8 boolean), (r10v11 boolean), (r10v14 boolean), (r10v28 boolean) binds: [B:37:0x00b8, B:44:0x00e4, B:52:0x0117, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r11v13 h21) = (r11v6 h21), (r11v8 h21), (r11v11 h21), (r11v23 h21) binds: [B:37:0x00b8, B:44:0x00e4, B:52:0x0117, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r12v11 ??) = (r12v22 ??), (r12v23 ??), (r12v24 ??), (r12v25 ??) binds: [B:37:0x00b8, B:44:0x00e4, B:52:0x0117, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:54:0x011b, B:19:0x004e, B:51:0x0108, B:23:0x0064, B:43:0x00d5, B:26:0x0071, B:36:0x00b2, B:40:0x00be, B:46:0x00e8, B:47:0x00ed, B:48:0x00ee), top: B:75:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        if (r10 == r1) goto L65;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x013e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [sL1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [h21] */
    /* JADX WARN: Type inference failed for: r11v2, types: [sL1] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v11, types: [sL1] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v4, types: [sL1] */
    /* JADX WARN: Type inference failed for: r12v6, types: [sL1] */
    /* JADX WARN: Type inference failed for: r12v9, types: [sL1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(com.impl.feature.platform.screens.platform.PlatformFragmentImpl r10, defpackage.C6542sL1 r11, boolean r12, defpackage.LM r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.feature.platform.screens.platform.PlatformFragmentImpl.B(com.impl.feature.platform.screens.platform.PlatformFragmentImpl, sL1, boolean, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(LM lm) {
        C6184qe1 c6184qe1;
        if (lm instanceof C6184qe1) {
            c6184qe1 = (C6184qe1) lm;
            int i2 = c6184qe1.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c6184qe1.g = i2 - Integer.MIN_VALUE;
            } else {
                c6184qe1 = new C6184qe1(this, lm);
            }
        } else {
            c6184qe1 = new C6184qe1(this, lm);
        }
        Object objE = c6184qe1.d;
        MN mn = MN.d;
        int i3 = c6184qe1.g;
        if (i3 == 0) {
            C1795Pt1.b(objE);
            WebView webViewF = this.u.f();
            c6184qe1.g = 1;
            objE = LE.e(webViewF, "typeof window.AppModule?.onChangeAccount === 'function'", c6184qe1);
            if (objE == mn) {
                return mn;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objE);
        }
        return Boolean.valueOf(Intrinsics.a(objE, "true"));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if (r9 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum D(defpackage.LM r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.impl.feature.platform.screens.platform.PlatformFragmentImpl.D(LM):java.lang.Enum");
    }

    public final void E() {
        super.l(this.B || this.C);
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        X5 x5 = new X5(this, 5);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new Z5(new Y5(this, 3), 3));
        return C2151Ui0.a(this, C2017Sp1.a.b(C2765af1.class), new C2649a6(interfaceC3770fO0A, 2), new C5974pe1(interfaceC3770fO0A), x5);
    }

    @Override // com.api.core.BindingFragment
    /* JADX INFO: renamed from: k */
    public final InterfaceC6856tq getH() {
        return this.u;
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    public final void l(boolean z) {
        this.B = z;
        E();
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String n() {
        return this.v.i();
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    @NotNull
    public final String o() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        return (String) ((C2765af1) obj).E.d.getValue();
    }

    @Override // com.base.feature.platform.screens.platform_webview.PlatformFragmentBase, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C2137Ud1 c2137Ud1 = this.u;
        WebView webViewF = c2137Ud1.f();
        Intrinsics.checkNotNullParameter(webViewF, "<this>");
        webViewF.removeJavascriptInterface("Android");
        WebView webViewF2 = c2137Ud1.f();
        C4247hf1 obj = new C4247hf1(new C4(this, 3));
        Intrinsics.checkNotNullParameter(webViewF2, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        webViewF2.addJavascriptInterface(obj, "Android");
        c2137Ud1.f().removeJavascriptInterface("AndroidMessageHandler");
        c2137Ud1.f().addJavascriptInterface(new IA(new C5500nO(this, 4), new C2767ag(this, 3), new A0(this, 3)), "AndroidMessageHandler");
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new m(null), 3);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    public final void q() {
        super.q();
        C1699On1 c1699On1 = this.x.v;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new b(viewLifecycleOwner, c1699On1, null, this), 3);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        AbstractC2140Ue1.c cVar = ((C2765af1) obj).w;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new h(viewLifecycleOwner2, cVar, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1621Nn1 c1621Nn1 = ((C2765af1) obj2).v;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new i(viewLifecycleOwner3, c1621Nn1, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1621Nn1 c1621Nn2 = ((C2765af1) obj3).y;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new c(viewLifecycleOwner4, c1621Nn2, null, this), 3);
        C6120qK1 c6120qK1 = this.y.n;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new g(viewLifecycleOwner5, c6120qK1, null, this), 3);
        C4612j90 c4612j90 = this.z;
        C1621Nn1 c1621Nn3 = c4612j90.C;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new d(viewLifecycleOwner6, c1621Nn3, null, this), 3);
        C4733jk c4733jk = new C4733jk(this.A.b(), 1);
        FP0 viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner7), null, new e(viewLifecycleOwner7, c4733jk, null, this), 3);
        FP0 viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner8), null, new f(viewLifecycleOwner8, c4612j90.A, null, this), 3);
    }
}
