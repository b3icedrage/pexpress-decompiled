package defpackage;

import android.content.res.ColorStateList;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4211hV0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C4211hV0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        S21 s21;
        int i = 0;
        Object obj2 = this.g;
        Object obj3 = this.e;
        switch (this.d) {
            case 0:
                int i2 = ActivityC6781tV0.Q;
                BottomNavigationView bottomNavigationView = (BottomNavigationView) obj3;
                if (((Boolean) obj).booleanValue()) {
                    V21 v21 = bottomNavigationView.e;
                    v21.getClass();
                    V21.f(R.id.main_account_fragment);
                    SparseArray<C1937Rp> sparseArray = v21.v;
                    C1937Rp c1937Rp = sparseArray.get(R.id.main_account_fragment);
                    V21.f(R.id.main_account_fragment);
                    S21[] s21Arr = v21.j;
                    if (s21Arr != null) {
                        int length = s21Arr.length;
                        while (true) {
                            if (i < length) {
                                s21 = s21Arr[i];
                                if (s21.getId() != R.id.main_account_fragment) {
                                    i++;
                                }
                            } else {
                                s21 = null;
                            }
                        }
                    } else {
                        s21 = null;
                    }
                    if (s21 != null && s21.H != null) {
                        ImageView imageView = s21.q;
                        if (imageView != null) {
                            s21.setClipChildren(true);
                            s21.setClipToPadding(true);
                            C1937Rp c1937Rp2 = s21.H;
                            if (c1937Rp2 != null) {
                                WeakReference<FrameLayout> weakReference = c1937Rp2.q;
                                if ((weakReference != null ? weakReference.get() : null) != null) {
                                    WeakReference<FrameLayout> weakReference2 = c1937Rp2.q;
                                    (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c1937Rp2);
                                }
                            }
                        }
                        s21.H = null;
                    }
                    if (c1937Rp != null) {
                        sparseArray.remove(R.id.main_account_fragment);
                    }
                } else {
                    C1937Rp c1937RpA = bottomNavigationView.a(R.id.main_account_fragment);
                    Intrinsics.checkNotNullExpressionValue(c1937RpA, "getOrCreateBadge(...)");
                    int color = C6333rM.getColor((ActivityC6781tV0) obj2, R.color.error);
                    Integer numValueOf = Integer.valueOf(color);
                    C2015Sp c2015Sp = c1937RpA.i;
                    c2015Sp.a.e = numValueOf;
                    Integer numValueOf2 = Integer.valueOf(color);
                    c2015Sp.b.e = numValueOf2;
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(numValueOf2.intValue());
                    NX0 nx0 = c1937RpA.e;
                    if (nx0.d.c != colorStateListValueOf) {
                        nx0.l(colorStateListValueOf);
                        c1937RpA.invalidateSelf();
                    }
                    if (c2015Sp.b.t.intValue() != 8388693) {
                        c2015Sp.a.t = 8388693;
                        c2015Sp.b.t = 8388693;
                        c1937RpA.e();
                    }
                }
                break;
            default:
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C2119Tx1 c2119Tx1 = (C2119Tx1) obj3;
                it.e(c2119Tx1.a.getString(R.string.preparing_text));
                it.d("");
                it.h(c2119Tx1.q((String) obj2));
                it.i(100, true, 0);
                break;
        }
        return Unit.a;
    }
}
