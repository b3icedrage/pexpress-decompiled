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

/* JADX INFO: renamed from: jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4717jg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ C4717jg(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        S21 s21;
        Object obj2 = this.g;
        int i = 0;
        Object obj3 = this.e;
        switch (this.d) {
            case 0:
                C7133v9.a AlertDialogParams = (C7133v9.a) obj;
                Intrinsics.checkNotNullParameter(AlertDialogParams, "$this$AlertDialogParams");
                AlertDialogParams.a(Integer.valueOf(R.string.log_out_text), R.color.error, R.color.white, new C7121v6((C6689t3) obj2, 1));
                TF.a.e(AlertDialogParams, Integer.valueOf(R.string.cancel_text), (A0) obj3, 2);
                AlertDialogParams.d(R.drawable.ic_logout_alert_icon);
                AlertDialogParams.g(R.string.are_you_sure_you_want_to_log_out_text);
                TF tf = AlertDialogParams.a;
                tf.n = false;
                tf.o = false;
                break;
            default:
                int i2 = ActivityC6781tV0.Q;
                BottomNavigationView bottomNavigationView = (BottomNavigationView) obj3;
                if (((Boolean) obj).booleanValue()) {
                    C1937Rp c1937RpA = bottomNavigationView.a(R.id.main_support_fragment);
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
                    if (c2015Sp.b.t.intValue() != 8388661) {
                        c2015Sp.a.t = 8388661;
                        c2015Sp.b.t = 8388661;
                        c1937RpA.e();
                    }
                } else {
                    V21 v21 = bottomNavigationView.e;
                    v21.getClass();
                    V21.f(R.id.main_support_fragment);
                    SparseArray<C1937Rp> sparseArray = v21.v;
                    C1937Rp c1937Rp = sparseArray.get(R.id.main_support_fragment);
                    V21.f(R.id.main_support_fragment);
                    S21[] s21Arr = v21.j;
                    if (s21Arr != null) {
                        int length = s21Arr.length;
                        while (true) {
                            if (i < length) {
                                s21 = s21Arr[i];
                                if (s21.getId() != R.id.main_support_fragment) {
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
                        sparseArray.remove(R.id.main_support_fragment);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
