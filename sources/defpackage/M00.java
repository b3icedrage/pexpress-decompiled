package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class M00 extends L00 {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.mediaContainer, 7);
    }

    @Override // defpackage.L00
    public final void A(Da2 da2) {
        this.E = da2;
        synchronized (this) {
            this.G |= 32;
        }
        j(3);
        v();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        String str;
        Drawable drawableD;
        Long l;
        C2980bd0 c2980bd0;
        int i3;
        Context context;
        int i4;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        Da2 da2 = this.E;
        String str2 = null;
        if ((111 & j) != 0) {
            if ((j & 97) == 0) {
                l = null;
            } else {
                EY0 ey0 = da2 != null ? da2.j : null;
                z(0, ey0);
                if (ey0 != null) {
                    l = (Long) ey0.d();
                } else {
                    l = null;
                }
            }
            long j4 = j & 98;
            j2 = 0;
            if (j4 != 0) {
                EY0 ey1 = da2 != null ? da2.m : null;
                z(1, ey1);
                boolean zW = ViewDataBinding.w(ey1 != null ? (Boolean) ey1.d() : null);
                if (j4 != 0) {
                    j |= zW ? 5376L : 2688L;
                }
                i = zW ? 0 : 8;
                i3 = zW ? 4 : 0;
                if (zW) {
                    context = this.B.getContext();
                    j3 = 104;
                    i4 = R.drawable.jivo_sdk_vic_message_status_error;
                } else {
                    j3 = 104;
                    context = this.B.getContext();
                    i4 = R.drawable.jivo_sdk_vic_message_status_sending;
                }
                drawableD = C7652xe.d(context, i4);
            } else {
                j3 = 104;
                i = 0;
                i3 = 0;
                drawableD = null;
            }
            if ((j & 100) == 0) {
                c2980bd0 = null;
            } else {
                EY0 ey2 = da2 != null ? da2.k : null;
                z(2, ey2);
                if (ey2 != null) {
                    c2980bd0 = (C2980bd0) ey2.d();
                } else {
                    c2980bd0 = null;
                }
            }
            if ((j & j3) != 0) {
                EY0 ey3 = da2 != null ? da2.l : null;
                z(3, ey3);
                if (ey3 != null) {
                    str2 = (String) ey3.d();
                }
            }
            str = str2;
            i2 = i3;
        } else {
            j2 = 0;
            j3 = 104;
            i = 0;
            i2 = 0;
            str = null;
            drawableD = null;
            l = null;
            c2980bd0 = null;
        }
        if ((j & j3) != j2) {
            C4689jY1.a(this.y, str);
        }
        if ((j & 98) != j2) {
            this.z.setVisibility(i);
            this.A.setVisibility(i2);
            this.B.setImageDrawable(drawableD);
        }
        if ((j & 97) != j2) {
            N7.z(this.C, l);
        }
        if ((j & 100) != j2) {
            AppCompatTextView view = this.D;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context2 = view.getContext();
            if (c2980bd0 != null) {
                AbstractC5539na2 abstractC5539na2 = c2980bd0.f;
                if (!(abstractC5539na2 instanceof AbstractC5539na2.b)) {
                    if (abstractC5539na2 instanceof AbstractC5539na2.a) {
                        view.setClickable(false);
                        view.setFocusable(false);
                        view.setText(context2.getString(Intrinsics.a(((AbstractC5539na2.a) abstractC5539na2).a, "filetransfer_disabled") ? R.string.file_transfer_disabled : R.string.media_uploading_common_error));
                        return;
                    }
                    return;
                }
                view.setClickable(false);
                view.setFocusable(false);
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                sb.append(N7.m(((AbstractC5539na2.b) abstractC5539na2).a, context2));
                sb.append(" / ");
                sb.append(N7.m(c2980bd0.c, context2));
                view.setText(sb.toString());
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.G |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 8;
        }
        return true;
    }
}
