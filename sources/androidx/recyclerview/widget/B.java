package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class B extends H {
    public y c;
    public x d;

    public static int e(@NonNull View view, z zVar) {
        return ((zVar.c(view) / 2) + zVar.e(view)) - ((zVar.l() / 2) + zVar.k());
    }

    public static View f(RecyclerView.m mVar, z zVar) {
        int iV = mVar.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (zVar.l() / 2) + zVar.k();
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = mVar.u(i2);
            int iAbs = Math.abs(((zVar.c(viewU) / 2) + zVar.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.H
    public final int[] b(@NonNull RecyclerView.m mVar, @NonNull View view) {
        int[] iArr = new int[2];
        if (mVar.d()) {
            iArr[0] = e(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.e()) {
            iArr[1] = e(view, h(mVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.H
    @SuppressLint({"UnknownNullness"})
    public View c(RecyclerView.m mVar) {
        if (mVar.e()) {
            return f(mVar, h(mVar));
        }
        if (mVar.d()) {
            return f(mVar, g(mVar));
        }
        return null;
    }

    @NonNull
    public final z g(@NonNull RecyclerView.m mVar) {
        x xVar = this.d;
        if (xVar == null || xVar.a != mVar) {
            this.d = new x(mVar);
        }
        return this.d;
    }

    @NonNull
    public final z h(@NonNull RecyclerView.m mVar) {
        y yVar = this.c;
        if (yVar == null || yVar.a != mVar) {
            this.c = new y(mVar);
        }
        return this.c;
    }
}
