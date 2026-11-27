package io.sentry.android.replay;

import android.view.View;
import defpackage.C1589Ne;
import defpackage.ML0;
import io.sentry.util.C4527a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends ML0 implements Function1<ArrayList<View>, ArrayList<View>> {
    public final /* synthetic */ s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.d = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<View> invoke(ArrayList<View> arrayList) {
        ArrayList<View> mViews = arrayList;
        Intrinsics.checkNotNullParameter(mViews, "mViews");
        s sVar = this.d;
        C4527a.C0404a c0404aA = sVar.e.a();
        try {
            s.a aVar = sVar.h;
            aVar.addAll(mViews);
            c0404aA.close();
            return aVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }
}
