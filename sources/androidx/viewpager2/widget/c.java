package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.C4233hc;
import defpackage.C4443ic;
import defpackage.EK;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends RecyclerView.r {
    public androidx.viewpager2.widget.a a;

    @NonNull
    public final ViewPager2 b;

    @NonNull
    public final ViewPager2.i c;

    @NonNull
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public static final class a {
        public int a;
        public float b;
        public int c;
    }

    public c(@NonNull ViewPager2 viewPager2) {
        this.b = viewPager2;
        ViewPager2.i iVar = viewPager2.n;
        this.c = iVar;
        this.d = (LinearLayoutManager) iVar.getLayoutManager();
        this.g = new a();
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(@NonNull RecyclerView recyclerView, int i) {
        androidx.viewpager2.widget.a aVar;
        androidx.viewpager2.widget.a aVar2;
        int i2 = this.e;
        boolean z = true;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.L0();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        }
        a aVar3 = this.g;
        if (z && i == 0) {
            e();
            if (!this.k) {
                int i4 = aVar3.a;
                if (i4 != -1 && (aVar2 = this.a) != null) {
                    aVar2.b(0.0f, i4, 0);
                }
            } else if (aVar3.c == 0) {
                int i5 = this.h;
                int i6 = aVar3.a;
                if (i5 != i6 && (aVar = this.a) != null) {
                    aVar.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (aVar3.c == 0) {
                int i7 = this.i;
                int i8 = aVar3.a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    androidx.viewpager2.widget.a aVar4 = this.a;
                    if (aVar4 != null) {
                        aVar4.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(@NonNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        androidx.viewpager2.widget.a aVar;
        this.k = true;
        e();
        boolean z = this.j;
        a aVar2 = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.k.A() == 1)) {
                        if (aVar2.c != 0) {
                            i3 = aVar2.a + 1;
                        }
                    }
                }
                i3 = aVar2.a;
            } else if (aVar2.c != 0) {
                i3 = aVar2.a + 1;
            } else {
                i3 = aVar2.a;
            }
            this.i = i3;
            if (this.h != i3 && (aVar = this.a) != null) {
                aVar.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = aVar2.a;
            if (i4 == -1) {
                i4 = 0;
            }
            androidx.viewpager2.widget.a aVar3 = this.a;
            if (aVar3 != null) {
                aVar3.c(i4);
            }
        }
        int i5 = aVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = aVar2.b;
        int i6 = aVar2.c;
        androidx.viewpager2.widget.a aVar4 = this.a;
        if (aVar4 != null) {
            aVar4.b(f, i5, i6);
        }
        int i7 = aVar2.a;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && aVar2.c == 0 && this.f != 1) {
            c(0);
            d();
        }
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        androidx.viewpager2.widget.a aVar = this.a;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        a aVar = this.g;
        aVar.a = -1;
        aVar.b = 0.0f;
        aVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[LOOP:2: B:64:0x013c->B:67:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014b A[SYNTHETIC] */
    public final void e() {
        int top;
        int iV;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iL0 = linearLayoutManager.L0();
        a aVar = this.g;
        aVar.a = iL0;
        if (iL0 == -1) {
            aVar.a = -1;
            aVar.b = 0.0f;
            aVar.c = 0;
            return;
        }
        View viewQ = linearLayoutManager.q(iL0);
        if (viewQ == null) {
            aVar.a = -1;
            aVar.b = 0.0f;
            aVar.c = 0;
            return;
        }
        int i3 = ((RecyclerView.n) viewQ.getLayoutParams()).b.left;
        int i4 = ((RecyclerView.n) viewQ.getLayoutParams()).b.right;
        int i5 = ((RecyclerView.n) viewQ.getLayoutParams()).b.top;
        int i6 = ((RecyclerView.n) viewQ.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewQ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewQ.getHeight() + i5 + i6;
        int width = viewQ.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.p;
        ViewPager2.i iVar = this.c;
        if (i7 == 0) {
            top = (viewQ.getLeft() - i3) - iVar.getPaddingLeft();
            if (this.b.k.A() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewQ.getTop() - i5) - iVar.getPaddingTop();
        }
        int i8 = -top;
        aVar.c = i8;
        if (i8 >= 0) {
            aVar.b = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iV2 = linearLayoutManager.v();
        if (iV2 != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iV2, 2);
            for (int i9 = 0; i9 < iV2; i9++) {
                View viewU = linearLayoutManager.u(i9);
                if (viewU == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewU.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C4443ic.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewU.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewU.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewU.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewU.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new C4233hc(0));
            int i10 = 1;
            while (true) {
                if (i10 >= iV2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[iV2 - 1][1] >= i13) {
                        if (linearLayoutManager.v() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iV = linearLayoutManager.v();
                for (int i14 = 0; i14 < iV; i14++) {
                    if (!C4443ic.a(linearLayoutManager.u(i14))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.v() <= 1) {
            iV = linearLayoutManager.v();
            while (i14 < iV) {
                if (!C4443ic.a(linearLayoutManager.u(i14))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(EK.e(aVar.c, "Page can only be offset by a positive amount, not by "));
    }
}
