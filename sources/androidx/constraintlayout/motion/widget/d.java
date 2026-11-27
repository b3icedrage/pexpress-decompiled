package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.C5208m0;
import defpackage.FK1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final MotionLayout a;
    public HashSet<View> c;
    public ArrayList<c.a> e;
    public final ArrayList<c> b = new ArrayList<>();
    public final String d = "ViewTransitionController";
    public final ArrayList<c.a> f = new ArrayList<>();

    public d(MotionLayout motionLayout) {
        this.a = motionLayout;
    }

    public static void a(c cVar) {
        FK1 sharedValues = ConstraintLayout.getSharedValues();
        int i = cVar.u;
        C5208m0 c5208m0 = new C5208m0(15);
        HashMap<Integer, HashSet<WeakReference<Object>>> map = sharedValues.a;
        HashSet<WeakReference<Object>> hashSet = map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(c5208m0));
    }
}
