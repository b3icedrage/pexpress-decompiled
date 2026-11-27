package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public class UR extends NX0 {
    public static final /* synthetic */ int C = 0;

    @NonNull
    public a B;

    @TargetApi(ConnectionResult.SERVICE_UPDATING)
    public static class b extends UR {
        @Override // defpackage.NX0
        public final void f(@NonNull Canvas canvas) {
            if (this.B.r.isEmpty()) {
                super.f(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.B.r);
            } else {
                canvas.clipRect(this.B.r, Region.Op.DIFFERENCE);
            }
            super.f(canvas);
            canvas.restore();
        }
    }

    @Override // defpackage.NX0, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.B = new a(this.B);
        return this;
    }

    public final void r(float f, float f2, float f3, float f4) {
        RectF rectF = this.B.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public static final class a extends NX0.b {

        @NonNull
        public final RectF r;

        public a(RJ1 rj1, RectF rectF) {
            super(rj1);
            this.r = rectF;
        }

        @Override // NX0.b, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.B = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.r = aVar.r;
        }
    }
}
