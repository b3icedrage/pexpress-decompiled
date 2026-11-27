package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: renamed from: nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5597nq extends AbstractC8032zS {
    public final a g;

    /* JADX INFO: renamed from: nq$a */
    public class a {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        public final void a(InterfaceC5387mq interfaceC5387mq, InterfaceC3876ft0 interfaceC3876ft0) {
            AbstractC5597nq.this.c.getClass();
            float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
            float lowestVisibleX = interfaceC5387mq.getLowestVisibleX();
            float highestVisibleX = interfaceC5387mq.getHighestVisibleX();
            Object objG = interfaceC3876ft0.G(lowestVisibleX, Float.NaN, AS.a.e);
            Object objG2 = interfaceC3876ft0.G(highestVisibleX, Float.NaN, AS.a.d);
            this.a = objG == null ? 0 : interfaceC3876ft0.p(objG);
            int iP = objG2 != null ? interfaceC3876ft0.p(objG2) : 0;
            this.b = iP;
            this.c = (int) ((iP - this.a) * fMax);
        }
    }

    public AbstractC5597nq(C7558xA c7558xA, C4454ie2 c4454ie2) {
        super(c4454ie2, 2);
        this.c = c7558xA;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(AbstractC8067zc2.c(9.0f));
        Paint paint3 = new Paint(1);
        this.e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(2.0f);
        this.e.setColor(Color.rgb(255, 187, 115));
        this.g = new a();
    }
}
