package com.base.feature.platform.filechooser;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.AbstractC1592Nf;
import defpackage.ActivityC1745Pd;
import defpackage.C0731Cd1;
import defpackage.C1526Mj;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import defpackage.C2294Wc1;
import defpackage.C2784ak0;
import defpackage.C2877b7;
import defpackage.C2904bF;
import defpackage.C3261cy;
import defpackage.C3470dy;
import defpackage.C3686f;
import defpackage.C4333i4;
import defpackage.C5189lv;
import defpackage.C5560ng;
import defpackage.C5653o60;
import defpackage.C5656o7;
import defpackage.C6333rM;
import defpackage.C6702t60;
import defpackage.C7335w7;
import defpackage.C8141zy;
import defpackage.FP0;
import defpackage.InterfaceC1686Oj0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3890fy;
import defpackage.InterfaceC4813k7;
import defpackage.JM;
import defpackage.KN;
import defpackage.L1;
import defpackage.Lf2;
import defpackage.M1;
import defpackage.MN;
import defpackage.Mf2;
import defpackage.N9;
import defpackage.Nh2;
import defpackage.Sh2;
import defpackage.Th2;
import defpackage.VE;
import defpackage.VK1;
import defpackage.XE;
import io.sentry.android.core.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewFileChooserUseCaseBase implements Nh2 {

    @NotNull
    public final ActivityC1745Pd a;

    @NotNull
    public final InterfaceC3890fy b;

    @NotNull
    public final C3470dy c;

    @NotNull
    public final VK1 d;

    @NotNull
    public final C3686f e;

    @NotNull
    public final C2877b7 f;

    @NotNull
    public final C2294Wc1 g;

    @Nullable
    public Mf2 h;

    @Nullable
    public CharSequence i;

    @NotNull
    public Object j;
    public boolean k;

    @Nullable
    public PermissionRequest l;

    @NotNull
    public final C7335w7 m;

    @NotNull
    public final C7335w7 n;

    @NotNull
    public final C7335w7 o;

    public /* synthetic */ class a implements InterfaceC4813k7, InterfaceC1686Oj0 {
        public a() {
        }

        @Override // defpackage.InterfaceC1686Oj0
        public final Function<?> a() {
            return new C2784ak0(1, WebViewFileChooserUseCaseBase.this, WebViewFileChooserUseCaseBase.class, "onChooserResult", "onChooserResult([Landroid/net/Uri;)V", 0);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object] */
        @Override // defpackage.InterfaceC4813k7
        public final void b(Object obj) {
            Object next;
            Uri[] uriArr = (Uri[]) obj;
            WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = WebViewFileChooserUseCaseBase.this;
            webViewFileChooserUseCaseBase.k = false;
            if (webViewFileChooserUseCaseBase.g.a == null) {
                webViewFileChooserUseCaseBase.h(null);
                return;
            }
            if (uriArr == null) {
                uriArr = null;
            } else if (uriArr.length == 0) {
                Iterator it = webViewFileChooserUseCaseBase.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    File file = ((C3261cy) next).c;
                    if (file.isFile() && file.length() > 0) {
                        break;
                    }
                }
                C3261cy c3261cy = (C3261cy) next;
                if (c3261cy != null) {
                    uriArr = new Uri[]{c3261cy.a};
                } else {
                    uriArr = null;
                }
            }
            webViewFileChooserUseCaseBase.h(uriArr);
            webViewFileChooserUseCaseBase.f(uriArr);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC4813k7) && (obj instanceof InterfaceC1686Oj0)) {
                return a().equals(((InterfaceC1686Oj0) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase$onPermissionRequest$1", f = "WebViewFileChooserUseCaseBase.kt", l = {149}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return WebViewFileChooserUseCaseBase.this.new b(jm);
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
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = WebViewFileChooserUseCaseBase.this;
                InterfaceC3890fy interfaceC3890fy = webViewFileChooserUseCaseBase.b;
                C8141zy c8141zy = new C8141zy(webViewFileChooserUseCaseBase, 4);
                C4333i4 c4333i4 = new C4333i4(webViewFileChooserUseCaseBase, 3);
                C5560ng c5560ng = new C5560ng(webViewFileChooserUseCaseBase, 6);
                this.d = 1;
                if (interfaceC3890fy.c(c8141zy, c4333i4, c5560ng, this) == mn) {
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

    @InterfaceC3368dU(c = "com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase$showNoCameraAccessDialog$1", f = "WebViewFileChooserUseCaseBase.kt", l = {283}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ Function0<Unit> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, JM<? super c> jm) {
            super(2, jm);
            this.g = function0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return WebViewFileChooserUseCaseBase.this.new c(this.g, jm);
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
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = WebViewFileChooserUseCaseBase.this;
                VK1 vk1 = webViewFileChooserUseCaseBase.d;
                C3686f c3686f = webViewFileChooserUseCaseBase.e;
                c3686f.getClass();
                c3686f.getClass();
                final Function0<Unit> dismissAction = this.g;
                final Th2 activeAction = new Th2(webViewFileChooserUseCaseBase, dismissAction);
                Intrinsics.checkNotNullParameter(activeAction, "activeAction");
                Intrinsics.checkNotNullParameter(dismissAction, "passiveAction");
                Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
                final int i2 = R.string.no_access_to_camera_title;
                final int i3 = R.string.no_access_to_camera_text;
                AbstractC1592Nf.p pVar = new AbstractC1592Nf.p(N9.a(new Function1() { // from class: mg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        M9.a AlertVerticalButtonsDialogParams = (M9.a) obj2;
                        Intrinsics.checkNotNullParameter(AlertVerticalButtonsDialogParams, "$this$AlertVerticalButtonsDialogParams");
                        AlertVerticalButtonsDialogParams.d(R.drawable.ic_no_files_acces);
                        AlertVerticalButtonsDialogParams.g(i2);
                        AlertVerticalButtonsDialogParams.f(i3);
                        TF.a.b(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.btn_go_to_settings), new C5560ng(activeAction, 0), 6);
                        TF.a.e(AlertVerticalButtonsDialogParams, Integer.valueOf(R.string.cancel_text), new F6(dismissAction, 1), 2);
                        C5770og action = new C5770og(dismissAction, 0);
                        Intrinsics.checkNotNullParameter(action, "action");
                        TF tf = AlertVerticalButtonsDialogParams.a;
                        tf.k = action;
                        tf.n = false;
                        tf.o = false;
                        return Unit.a;
                    }
                }));
                this.d = 1;
                if (vk1.a(pVar, null, null) == mn) {
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

    public WebViewFileChooserUseCaseBase(@NotNull ActivityC1745Pd activity, @NotNull InterfaceC3890fy cameraPermissionUseCase, @NotNull C3470dy cameraOutputFileFactory, @NotNull VK1 showAlertDialogUseCase, @NotNull C3686f permissionDialogResProvider, @NotNull C2877b7 scopeProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(cameraPermissionUseCase, "cameraPermissionUseCase");
        Intrinsics.checkNotNullParameter(cameraOutputFileFactory, "cameraOutputFileFactory");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(permissionDialogResProvider, "permissionDialogResProvider");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.a = activity;
        this.b = cameraPermissionUseCase;
        this.c = cameraOutputFileFactory;
        this.d = showAlertDialogUseCase;
        this.e = permissionDialogResProvider;
        this.f = scopeProvider;
        this.g = new C2294Wc1();
        this.j = C5653o60.d;
        this.m = activity.getActivityResultRegistry().d("web_view_file_chooser", new C0731Cd1(), new a());
        this.n = activity.getActivityResultRegistry().d("web_view_file_chooser_camera_permission", new C5656o7(), new InterfaceC4813k7() { // from class: Oh2
            @Override // defpackage.InterfaceC4813k7
            public final void b(Object obj) {
                this.a.g(((Boolean) obj).booleanValue());
            }
        });
        this.o = activity.getActivityResultRegistry().d("web_view_media_camera_permission", new C5656o7(), new InterfaceC4813k7() { // from class: Ph2
            @Override // defpackage.InterfaceC4813k7
            public final void b(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = this.a;
                webViewFileChooserUseCaseBase.e(zBooleanValue);
                if (zBooleanValue) {
                    return;
                }
                webViewFileChooserUseCaseBase.i(new Qh2(0));
            }
        });
        activity.getLifecycle().a(new DefaultLifecycleObserver() { // from class: com.base.feature.platform.filechooser.WebViewFileChooserUseCaseBase.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(FP0 owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                WebViewFileChooserUseCaseBase webViewFileChooserUseCaseBase = WebViewFileChooserUseCaseBase.this;
                webViewFileChooserUseCaseBase.k = false;
                webViewFileChooserUseCaseBase.h(null);
                webViewFileChooserUseCaseBase.f(null);
                webViewFileChooserUseCaseBase.e(false);
            }
        });
    }

    @Override // defpackage.Nh2
    public final void a() {
        if (this.k) {
            return;
        }
        this.k = false;
        h(null);
        f(null);
    }

    @Override // defpackage.Nh2
    public final void b(@Nullable PermissionRequest permissionRequest) {
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        if (resources == null) {
            resources = new String[0];
        }
        if (!C1526Mj.m(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            permissionRequest.deny();
            return;
        }
        if (C6333rM.checkSelfPermission(this.a, this.b.a()) == 0) {
            permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            return;
        }
        e(false);
        this.l = permissionRequest;
        C5189lv.k(this.f.a, null, new b(null), 3);
    }

    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.Nh2
    public final boolean c(@Nullable ValueCallback next, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence title;
        if (next == null) {
            return false;
        }
        this.k = false;
        h(null);
        C2294Wc1 c2294Wc1 = this.g;
        c2294Wc1.getClass();
        Intrinsics.checkNotNullParameter(next, "next");
        c2294Wc1.a(null);
        c2294Wc1.a = next;
        M1 m1 = M1.a;
        String[] acceptTypes = fileChooserParams != null ? fileChooserParams.getAcceptTypes() : null;
        int mode = fileChooserParams != null ? fileChooserParams.getMode() : 0;
        boolean z4 = fileChooserParams != null && fileChooserParams.isCaptureEnabled();
        L1 extensionToMime = new L1(1, m1, M1.class, "systemMimeFor", "systemMimeFor(Ljava/lang/String;)Ljava/lang/String;", 0, 0);
        m1.getClass();
        Intrinsics.checkNotNullParameter(extensionToMime, "extensionToMime");
        if (acceptTypes == null) {
            acceptTypes = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : acceptTypes) {
            C2904bF.o(arrayList, StringsKt.R(str, new char[]{','}));
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = StringsKt.d0((String) it.next()).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList2.add(lowerCase);
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : arrayList3) {
            if (StringsKt.D(str2, '/')) {
                linkedHashSet.add(str2);
            } else {
                String strM = StringsKt.M(str2, ".");
                String str3 = (String) M1.b.get(strM);
                if (str3 == null) {
                    str3 = (String) extensionToMime.invoke(strM);
                }
                if (str3 != null) {
                    String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    linkedHashSet.add(lowerCase2);
                }
            }
        }
        List listE0 = CollectionsKt.e0(linkedHashSet);
        if (listE0.isEmpty()) {
            listE0 = VE.c("*/*");
        }
        List list = listE0;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str4 = (String) it2.next();
                    if (Intrinsics.a(str4, "*/*") || d.o(str4, "image/", false)) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    String str5 = (String) it3.next();
                    if (Intrinsics.a(str5, "*/*") || d.o(str5, "video/", false)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (list != null && list.isEmpty()) {
            z3 = true;
            break;
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = true;
                break;
            }
            String str6 = (String) it4.next();
            if (!d.o(str6, "image/", false) && !d.o(str6, "video/", false)) {
                z3 = false;
                break;
            }
        }
        boolean z5 = mode == 1;
        boolean z6 = z2 && !z;
        boolean z7 = z4 && z3;
        boolean z8 = mode != 3;
        Mf2 mf2 = new Mf2(list, z5, z, z6, z7, z8);
        if (!z8) {
            f(null);
            return true;
        }
        this.h = mf2;
        if (fileChooserParams == null || (title = fileChooserParams.getTitle()) == null || StringsKt.I(title)) {
            title = null;
        }
        this.i = title;
        if (z || z6) {
            C5189lv.k(this.f.a, null, new Sh2(this, mf2, null), 3);
            return true;
        }
        g(false);
        return true;
    }

    @Override // defpackage.Nh2
    public final void d(@Nullable PermissionRequest permissionRequest) {
        if (permissionRequest == null || !permissionRequest.equals(this.l)) {
            return;
        }
        this.l = null;
    }

    public final void e(boolean z) {
        Object objA;
        PermissionRequest permissionRequest = this.l;
        if (permissionRequest == null) {
            return;
        }
        this.l = null;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            if (z) {
                permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            } else {
                permissionRequest.deny();
            }
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.d("WebViewFileChooser", "PermissionRequest was already answered", thA);
        }
    }

    public final void f(Uri[] uriArr) {
        if (this.g.a(uriArr)) {
            this.h = null;
            this.i = null;
        }
    }

    public final void g(boolean z) {
        Iterable iterableO;
        Object next;
        Object next2;
        Object objA;
        Mf2 mf2 = this.h;
        if (mf2 == null) {
            return;
        }
        if (z) {
            boolean z2 = mf2.c;
            C3470dy c3470dy = this.c;
            C3261cy[] elements = {z2 ? c3470dy.a("IMG_", ".jpg", true) : null, mf2.d ? c3470dy.a("VID_", ".mp4", false) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            iterableO = C1526Mj.o(elements);
        } else {
            iterableO = C5653o60.d;
        }
        this.j = iterableO;
        CharSequence charSequence = this.i;
        Iterator it = iterableO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((C3261cy) next).b);
        C3261cy c3261cy = (C3261cy) next;
        Uri uri = c3261cy != null ? c3261cy.a : null;
        Iterator it2 = iterableO.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((C3261cy) next2).b);
        C3261cy c3261cy2 = (C3261cy) next2;
        Lf2 lf2 = new Lf2(mf2, charSequence, uri, c3261cy2 != null ? c3261cy2.a : null);
        this.k = true;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            this.m.a(lf2);
            objA = Unit.a;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.d("WebViewFileChooser", "Cannot launch the file chooser", thA);
            this.k = false;
            f(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void h(Uri[] uriArr) {
        Set setH = uriArr != null ? C1526Mj.H(uriArr) : null;
        if (setH == null) {
            setH = C6702t60.d;
        }
        for (C3261cy c3261cy : this.j) {
            boolean zContains = setH.contains(c3261cy.a);
            File file = c3261cy.c;
            if (!zContains) {
                try {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    file.delete();
                } catch (Throwable th) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    C1795Pt1.a(th);
                }
            } else if (!file.isFile() || file.length() <= 0) {
                try {
                    C1717Ot1.a aVar3 = C1717Ot1.e;
                    file.delete();
                } catch (Throwable th2) {
                    C1717Ot1.a aVar4 = C1717Ot1.e;
                    C1795Pt1.a(th2);
                }
            }
        }
        this.j = C5653o60.d;
    }

    public final void i(Function0<Unit> function0) {
        C5189lv.k(this.f.a, null, new c(function0, null), 3);
    }
}
