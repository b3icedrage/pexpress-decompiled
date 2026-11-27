package com.base.feature.platform.screens.platform_webview;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.feature.webpage.screen.WebViewFragment;
import com.appsflyer.share.attribution.RequestError;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.AbstractC2140Ue1;
import defpackage.AbstractC3198cf1;
import defpackage.AbstractC4456if1;
import defpackage.C1280Je1;
import defpackage.C1449Lj;
import defpackage.C1795Pt1;
import defpackage.C2218Ve1;
import defpackage.C3286d41;
import defpackage.C4797k3;
import defpackage.C5131le1;
import defpackage.C5189lv;
import defpackage.C5344me1;
import defpackage.C6266r20;
import defpackage.C7236vf0;
import defpackage.C7652xe;
import defpackage.Ch2;
import defpackage.InterfaceC2059Td1;
import defpackage.InterfaceC2297Wd1;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.KN;
import defpackage.LM;
import defpackage.MN;
import defpackage.OR;
import defpackage.QV0;
import defpackage.RV;
import defpackage.VE;
import defpackage.WE;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/platform/screens/platform_webview/PlatformFragmentBase;", "LUe1;", "VM", "Lcom/api/feature/webpage/screen/WebViewFragment;", "FeaturePlatformBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PlatformFragmentBase<VM extends AbstractC2140Ue1> extends WebViewFragment<VM> {

    @NotNull
    public final InterfaceC2297Wd1 o;

    @NotNull
    public final InterfaceC2059Td1 p;

    @NotNull
    public final C1280Je1 q;

    @NotNull
    public final AbstractC4456if1 r;

    @NotNull
    public final ReporterApi s;

    @InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformFragmentBase$onResume$1", f = "PlatformFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ PlatformFragmentBase<VM> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlatformFragmentBase<VM> platformFragmentBase, JM<? super a> jm) {
            super(2, jm);
            this.e = platformFragmentBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
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
                this.d = 1;
                if (PlatformFragmentBase.A(this.e, this) == mn) {
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

    @InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformFragmentBase$onViewCreated$1", f = "PlatformFragmentBase.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ PlatformFragmentBase<VM> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PlatformFragmentBase<VM> platformFragmentBase, JM<? super b> jm) {
            super(2, jm);
            this.e = platformFragmentBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            PlatformFragmentBase<VM> platformFragmentBase = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                platformFragmentBase.q();
                this.d = 1;
                if (platformFragmentBase.x(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            Object obj2 = platformFragmentBase.i;
            Intrinsics.checkNotNull(obj2);
            AbstractC2140Ue1 abstractC2140Ue1 = (AbstractC2140Ue1) obj2;
            abstractC2140Ue1.getClass();
            C5189lv.k(C3286d41.a, null, new C2218Ve1(abstractC2140Ue1, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformFragmentBase(@NotNull InterfaceC2297Wd1 platformCallbacks, @NotNull InterfaceC2059Td1 bindingProvider, @NotNull C1280Je1 resourceProvider, @NotNull Ch2 webViewCustomizer, @NotNull AbstractC3198cf1 customWebChromeClient, @NotNull AbstractC4456if1 webViewClient, @NotNull ReporterApi reporter) {
        super(bindingProvider, webViewCustomizer, customWebChromeClient, webViewClient);
        Intrinsics.checkNotNullParameter(platformCallbacks, "platformCallbacks");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(webViewCustomizer, "webViewCustomizer");
        Intrinsics.checkNotNullParameter(customWebChromeClient, "customWebChromeClient");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.o = platformCallbacks;
        this.p = bindingProvider;
        this.q = resourceProvider;
        this.r = webViewClient;
        this.s = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (z(r8, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (y(r8, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(com.base.feature.platform.screens.platform_webview.PlatformFragmentBase r8, defpackage.LM r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.platform.screens.platform_webview.PlatformFragmentBase.A(com.base.feature.platform.screens.platform_webview.PlatformFragmentBase, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object y(PlatformFragmentBase platformFragmentBase, LM lm) {
        C5131le1 c5131le1;
        FragmentManager childFragmentManager;
        C1280Je1 c1280Je1;
        List<Integer> listC;
        int i;
        int i2;
        PlatformFragmentBase platformFragmentBase2;
        AbstractC2140Ue1 abstractC2140Ue1;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        Object[] objArr;
        if (lm instanceof C5131le1) {
            c5131le1 = (C5131le1) lm;
            int i6 = c5131le1.s;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c5131le1.s = i6 - Integer.MIN_VALUE;
            } else {
                c5131le1 = new C5131le1(platformFragmentBase, lm);
            }
        } else {
            c5131le1 = new C5131le1(platformFragmentBase, lm);
        }
        Object objA = c5131le1.q;
        Object obj = MN.d;
        int i7 = c5131le1.s;
        if (i7 == 0) {
            C1795Pt1.b(objA);
            Object obj2 = platformFragmentBase.i;
            Intrinsics.checkNotNull(obj2);
            AbstractC2140Ue1 abstractC2140Ue2 = (AbstractC2140Ue1) obj2;
            childFragmentManager = platformFragmentBase.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            c1280Je1 = platformFragmentBase.q;
            c1280Je1.getClass();
            c1280Je1.getClass();
            listC = VE.c(new Integer(R.string.platform_name));
            String[] strArr2 = new String[2];
            strArr2[0] = c1280Je1.a();
            Object obj3 = platformFragmentBase.i;
            Intrinsics.checkNotNull(obj3);
            c5131le1.d = platformFragmentBase;
            c5131le1.e = c1280Je1;
            c5131le1.g = strArr2;
            c5131le1.h = strArr2;
            c5131le1.i = listC;
            c5131le1.j = childFragmentManager;
            c5131le1.k = abstractC2140Ue2;
            c5131le1.l = 1;
            c5131le1.m = R.string.platform_soother_sub_title;
            c5131le1.n = R.string.download_platform_tittle;
            c5131le1.o = R.drawable.ic_error_update_available;
            c5131le1.p = R.id.platform_fragment_root;
            c5131le1.s = 1;
            objA = C7236vf0.a(((AbstractC2140Ue1) obj3).s.k(), c5131le1);
            if (objA == obj) {
                return obj;
            }
            i = 1;
            i2 = R.string.download_platform_tittle;
            platformFragmentBase2 = platformFragmentBase;
            abstractC2140Ue1 = abstractC2140Ue2;
            i3 = R.id.platform_fragment_root;
            i4 = R.string.platform_soother_sub_title;
            i5 = R.drawable.ic_error_update_available;
            strArr = strArr2;
            objArr = strArr2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = c5131le1.p;
            int i9 = c5131le1.o;
            int i10 = c5131le1.n;
            int i11 = c5131le1.m;
            i = c5131le1.l;
            AbstractC2140Ue1 abstractC2140Ue3 = c5131le1.k;
            childFragmentManager = c5131le1.j;
            listC = c5131le1.i;
            Object[] objArr2 = c5131le1.h;
            String[] strArr3 = c5131le1.g;
            c1280Je1 = c5131le1.e;
            PlatformFragmentBase platformFragmentBase3 = c5131le1.d;
            C1795Pt1.b(objA);
            i3 = i8;
            platformFragmentBase2 = platformFragmentBase3;
            abstractC2140Ue1 = abstractC2140Ue3;
            i4 = i11;
            i2 = i10;
            i5 = i9;
            objArr = objArr2;
            strArr = strArr3;
        }
        objArr[i] = objA;
        List<String> listF = WE.f(strArr);
        c1280Je1.getClass();
        AbstractC2140Ue1 abstractC2140Ue4 = abstractC2140Ue1;
        abstractC2140Ue4.m(childFragmentManager, i3, i5, i2, listC, i4, listF, R.string.platform_soother_button_title_download_app, new C1449Lj(platformFragmentBase2, 1));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object z(PlatformFragmentBase platformFragmentBase, LM lm) {
        C5344me1 c5344me1;
        FragmentManager childFragmentManager;
        C1280Je1 c1280Je1;
        List<Integer> listC;
        int i;
        int i2;
        PlatformFragmentBase platformFragmentBase2;
        AbstractC2140Ue1 abstractC2140Ue1;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        Object[] objArr;
        if (lm instanceof C5344me1) {
            c5344me1 = (C5344me1) lm;
            int i6 = c5344me1.s;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c5344me1.s = i6 - Integer.MIN_VALUE;
            } else {
                c5344me1 = new C5344me1(platformFragmentBase, lm);
            }
        } else {
            c5344me1 = new C5344me1(platformFragmentBase, lm);
        }
        Object objA = c5344me1.q;
        Object obj = MN.d;
        int i7 = c5344me1.s;
        if (i7 == 0) {
            C1795Pt1.b(objA);
            Object obj2 = platformFragmentBase.i;
            Intrinsics.checkNotNull(obj2);
            AbstractC2140Ue1 abstractC2140Ue2 = (AbstractC2140Ue1) obj2;
            childFragmentManager = platformFragmentBase.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            c1280Je1 = platformFragmentBase.q;
            c1280Je1.getClass();
            c1280Je1.getClass();
            listC = VE.c(new Integer(R.string.platform_name));
            String[] strArr2 = new String[2];
            strArr2[0] = c1280Je1.a();
            Object obj3 = platformFragmentBase.i;
            Intrinsics.checkNotNull(obj3);
            c5344me1.d = platformFragmentBase;
            c5344me1.e = c1280Je1;
            c5344me1.g = strArr2;
            c5344me1.h = strArr2;
            c5344me1.i = listC;
            c5344me1.j = childFragmentManager;
            c5344me1.k = abstractC2140Ue2;
            c5344me1.l = 1;
            c5344me1.m = R.string.platform_soother_sub_title;
            c5344me1.n = R.string.download_platform_tittle;
            c5344me1.o = R.drawable.ic_iq_option_app_logo;
            c5344me1.p = R.id.platform_fragment_root;
            c5344me1.s = 1;
            objA = C7236vf0.a(((AbstractC2140Ue1) obj3).s.k(), c5344me1);
            if (objA == obj) {
                return obj;
            }
            i = 1;
            i2 = R.string.download_platform_tittle;
            platformFragmentBase2 = platformFragmentBase;
            abstractC2140Ue1 = abstractC2140Ue2;
            i3 = R.id.platform_fragment_root;
            i4 = R.string.platform_soother_sub_title;
            i5 = R.drawable.ic_iq_option_app_logo;
            strArr = strArr2;
            objArr = strArr2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = c5344me1.p;
            int i9 = c5344me1.o;
            int i10 = c5344me1.n;
            int i11 = c5344me1.m;
            i = c5344me1.l;
            AbstractC2140Ue1 abstractC2140Ue3 = c5344me1.k;
            childFragmentManager = c5344me1.j;
            listC = c5344me1.i;
            Object[] objArr2 = c5344me1.h;
            String[] strArr3 = c5344me1.g;
            c1280Je1 = c5344me1.e;
            PlatformFragmentBase platformFragmentBase3 = c5344me1.d;
            C1795Pt1.b(objA);
            i3 = i8;
            platformFragmentBase2 = platformFragmentBase3;
            abstractC2140Ue1 = abstractC2140Ue3;
            i4 = i11;
            i2 = i10;
            i5 = i9;
            objArr = objArr2;
            strArr = strArr3;
        }
        objArr[i] = objA;
        List<String> listF = WE.f(strArr);
        c1280Je1.getClass();
        AbstractC2140Ue1 abstractC2140Ue4 = abstractC2140Ue1;
        abstractC2140Ue4.m(childFragmentManager, i3, i5, i2, listC, i4, listF, R.string.platform_soother_button_title_open_app, new C4797k3(platformFragmentBase2, 4));
        return Unit.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C5189lv.k(C7652xe.f(this), null, new a(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        WebView webViewF = this.j.f();
        if (webViewF != null) {
            webViewF.setBackgroundColor(0);
        }
        WebViewFragment.u(this, true, 2);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = C7652xe.f(this);
        RV rv = C6266r20.a;
        C5189lv.k(lifecycleCoroutineScopeImplF, QV0.a, new b(this, null), 2);
    }

    @Override // com.api.feature.webpage.screen.WebViewFragment
    /* JADX INFO: renamed from: p */
    public final OR getM() {
        return this.r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (A(r2, r0) == r1) goto L26;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(@org.jetbrains.annotations.NotNull defpackage.LM r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.C4453ie1
            if (r0 == 0) goto L13
            r0 = r15
            ie1 r0 = (defpackage.C4453ie1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ie1 r0 = new ie1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.C1795Pt1.b(r15)
            goto Lab
        L2b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L33:
            com.base.feature.platform.screens.platform_webview.PlatformFragmentBase r2 = r0.d
            defpackage.C1795Pt1.b(r15)
            goto L5e
        L39:
            defpackage.C1795Pt1.b(r15)
            VM extends xG r15 = r14.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            Ue1 r15 = (defpackage.AbstractC2140Ue1) r15
            android.content.Context r2 = r14.requireContext()
            java.lang.String r5 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.d = r14
            r0.h = r4
            lD0 r15 = r15.r
            rf0 r15 = r15.l()
            java.lang.Object r15 = defpackage.C4466ii.o(r15, r0)
            if (r15 != r1) goto L5d
            goto Laa
        L5d:
            r2 = r14
        L5e:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r4 = r15.booleanValue()
            com.api.feature.analytics.reporters.ReporterApi r5 = r2.s
            la r6 = defpackage.EnumC5113la.SHOW
            com.api.feature.analytics.reporters.ReporterApi.a.c(r5, r6, r15)
            if (r4 == 0) goto L9f
            je1 r7 = new je1
            VM extends xG r9 = r2.i
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            java.lang.Class<Ue1> r10 = defpackage.AbstractC2140Ue1.class
            java.lang.String r11 = "startWebViewPreloading"
            r8 = 0
            java.lang.String r12 = "startWebViewPreloading()V"
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            if1 r15 = r2.r
            r15.getClass()
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r15.c = r7
            Xf r0 = new Xf
            r1 = 4
            r0.<init>(r2, r1)
            r15.a(r0)
            r2.r()
            kotlin.Unit r15 = kotlin.Unit.a
            return r15
        L9f:
            r15 = 0
            r0.d = r15
            r0.h = r3
            java.lang.Object r15 = A(r2, r0)
            if (r15 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r15 = kotlin.Unit.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.base.feature.platform.screens.platform_webview.PlatformFragmentBase.x(LM):java.lang.Object");
    }
}
