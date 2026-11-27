package com.pexpress.tool;

import android.os.Bundle;
import android.view.View;
import defpackage.ActivityC6781tV0;
import defpackage.C2222Vg;
import defpackage.C5345me2;
import defpackage.C6609sg;
import defpackage.Cd2;
import defpackage.FV0;
import defpackage.InterfaceC1686Oj0;
import defpackage.InterfaceC4819k81;
import defpackage.RF0;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pexpress/tool/MainActivityImpl;", "LtV0;", "<init>", "()V", "app_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainActivityImpl extends ActivityC6781tV0 {
    public static final /* synthetic */ int R = 0;

    public static final class a implements InterfaceC4819k81, InterfaceC1686Oj0 {
        public final /* synthetic */ Function1 a;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // defpackage.InterfaceC1686Oj0
        @NotNull
        public final Function<?> a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC4819k81
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof InterfaceC4819k81) && (obj instanceof InterfaceC1686Oj0)) {
                return this.a.equals(((InterfaceC1686Oj0) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    @Override // defpackage.ActivityC6781tV0, defpackage.AbstractActivityC6436rq, androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.ActivityC2686aH, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FV0 fv0 = this.A;
        if (fv0 == null) {
            Intrinsics.l("mainActivityProvider");
            throw null;
        }
        fv0.c(this);
        w().n().e(this, new a(new C6609sg(this, 1)));
        View viewFindViewById = getWindow().getDecorView().findViewById(android.R.id.content);
        RF0 rf0 = new RF0(this);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        Cd2.d.u(viewFindViewById, rf0);
        w().o().e(this, new a(new C2222Vg(viewFindViewById, 2)));
    }
}
