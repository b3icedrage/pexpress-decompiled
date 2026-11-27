package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class x extends z {
    @Override // androidx.recyclerview.widget.z
    public final int b(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        return view.getRight() + ((RecyclerView.n) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.z
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.z
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.z
    public final int e(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.a.getClass();
        return (view.getLeft() - ((RecyclerView.n) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.z
    public final int f() {
        return this.a.n;
    }

    @Override // androidx.recyclerview.widget.z
    public final int g() {
        RecyclerView.m mVar = this.a;
        return mVar.n - mVar.D();
    }

    @Override // androidx.recyclerview.widget.z
    public final int h() {
        return this.a.D();
    }

    @Override // androidx.recyclerview.widget.z
    public final int i() {
        return this.a.l;
    }

    @Override // androidx.recyclerview.widget.z
    public final int j() {
        return this.a.m;
    }

    @Override // androidx.recyclerview.widget.z
    public final int k() {
        return this.a.C();
    }

    @Override // androidx.recyclerview.widget.z
    public final int l() {
        RecyclerView.m mVar = this.a;
        return (mVar.n - mVar.C()) - mVar.D();
    }

    @Override // androidx.recyclerview.widget.z
    public final int m(View view) {
        RecyclerView.m mVar = this.a;
        Rect rect = this.c;
        mVar.I(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.z
    public final int n(View view) {
        RecyclerView.m mVar = this.a;
        Rect rect = this.c;
        mVar.I(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.z
    public final void o(int i) {
        this.a.M(i);
    }
}
