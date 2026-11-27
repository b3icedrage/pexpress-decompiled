package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: im1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4484im1 extends ConstraintLayout {
    public final RunnableC7221vb1 w;
    public int x;
    public final NX0 y;

    public C4484im1(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC7221vb1 runnableC7221vb1 = this.w;
            handler.removeCallbacks(runnableC7221vb1);
            handler.post(runnableC7221vb1);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC7221vb1 runnableC7221vb1 = this.w;
            handler.removeCallbacks(runnableC7221vb1);
            handler.post(runnableC7221vb1);
        }
    }

    public void q() {
        c cVar = new c();
        cVar.e(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.x * 0.66f) : this.x;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                c.b bVar = cVar.h(((View) it.next()).getId()).e;
                bVar.A = R.id.circle_center;
                bVar.B = iRound;
                bVar.C = size;
                size += 360.0f / list.size();
            }
        }
        cVar.b(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.y.l(ColorStateList.valueOf(i));
    }

    public C4484im1(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        NX0 nx0 = new NX0();
        this.y = nx0;
        C3451dr1 c3451dr1 = new C3451dr1(0.5f);
        RJ1.a aVarE = nx0.d.a.e();
        aVarE.e = c3451dr1;
        aVarE.f = c3451dr1;
        aVarE.g = c3451dr1;
        aVarE.h = c3451dr1;
        nx0.setShapeAppearanceModel(aVarE.a());
        this.y.l(ColorStateList.valueOf(-1));
        NX0 nx1 = this.y;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setBackground(nx1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.F, i, 0);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.w = new RunnableC7221vb1(this, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
