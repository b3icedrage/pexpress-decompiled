package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class XW0 extends RelativeLayout implements InterfaceC6446rt0 {
    public C3791fV0 d;
    public final C3791fV0 e;
    public WeakReference<AbstractC7347wA> g;

    public XW0(Context context) {
        super(context);
        this.d = new C3791fV0();
        this.e = new C3791fV0();
        setupLayoutResource(R.layout.marker);
    }

    private void setupLayoutResource(int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, this);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
    }

    @Override // defpackage.InterfaceC6446rt0
    public void a(Canvas canvas, float f, float f2) {
        C3791fV0 offset = getOffset();
        float f3 = offset.e;
        C3791fV0 c3791fV0 = this.e;
        c3791fV0.e = f3;
        c3791fV0.g = offset.g;
        AbstractC7347wA chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        float f4 = c3791fV0.e;
        if (f + f4 < 0.0f) {
            c3791fV0.e = -f;
        } else if (chartView != null && f + width + f4 > chartView.getWidth()) {
            c3791fV0.e = (chartView.getWidth() - f) - width;
        }
        float f5 = c3791fV0.g;
        if (f2 + f5 < 0.0f) {
            c3791fV0.g = -f2;
        } else if (chartView != null && f2 + height + f5 > chartView.getHeight()) {
            c3791fV0.g = (chartView.getHeight() - f2) - height;
        }
        int iSave = canvas.save();
        canvas.translate(f + c3791fV0.e, f2 + c3791fV0.g);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.InterfaceC6446rt0
    public void b(C3506e70 c3506e70, C7482wo0 c7482wo0) {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public AbstractC7347wA getChartView() {
        WeakReference<AbstractC7347wA> weakReference = this.g;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public C3791fV0 getOffset() {
        return this.d;
    }

    public void setChartView(AbstractC7347wA abstractC7347wA) {
        this.g = new WeakReference<>(abstractC7347wA);
    }

    public void setOffset(C3791fV0 c3791fV0) {
        this.d = c3791fV0;
        if (c3791fV0 == null) {
            this.d = new C3791fV0();
        }
    }
}
