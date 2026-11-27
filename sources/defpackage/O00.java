package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import android.webkit.URLUtil;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class O00 extends N00 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.cardView, 2);
        sparseIntArray.put(R.id.placeholder, 3);
        sparseIntArray.put(R.id.image, 4);
        sparseIntArray.put(R.id.progress, 5);
        sparseIntArray.put(R.id.status, 6);
    }

    @Override // defpackage.N00
    public final void A(Ha2 ha2) {
        this.z = ha2;
        synchronized (this) {
            this.B |= 4;
        }
        j(3);
        v();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [Cw0, T] */
    /* JADX WARN: Type inference failed for: r7v4, types: [Cw0, T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        C2980bd0 c2980bd0;
        String str;
        int i;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        Ha2 ha2 = this.z;
        long j2 = j & 13;
        if (j2 == 0) {
            c2980bd0 = null;
        } else {
            EY0 ey0 = ha2 != null ? ha2.k : null;
            z(0, ey0);
            if (ey0 != null) {
                c2980bd0 = (C2980bd0) ey0.d();
            } else {
                c2980bd0 = null;
            }
        }
        if (j2 != 0) {
            ConstraintLayout layout = this.y;
            Intrinsics.checkNotNullParameter(layout, "layout");
            if (c2980bd0 == null || (str = c2980bd0.d) == null) {
                return;
            }
            Context context = layout.getContext();
            C3027bp1 c3027bp1 = new C3027bp1();
            ?? r7 = (C0787Cw0) layout.getTag();
            c3027bp1.d = r7;
            if (r7 == 0) {
                ?? c0787Cw0 = new C0787Cw0(layout);
                c3027bp1.d = c0787Cw0;
                layout.setTag(c0787Cw0);
            }
            ((C0787Cw0) c3027bp1.d).a.setImageDrawable(null);
            Context context2 = ((C0787Cw0) c3027bp1.d).a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "viewHolder.imageView.context");
            InterfaceC6246qw0 interfaceC6246qw0I = LE.i(context2);
            Context context3 = ((C0787Cw0) c3027bp1.d).a.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "viewHolder.imageView.context");
            C7716xw0.a aVar = new C7716xw0.a(context3);
            aVar.c = str;
            if (URLUtil.isContentUrl(str)) {
                ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
                AbstractC5539na2 abstractC5539na2 = c2980bd0.f;
                if (progressBar != null) {
                    progressBar.setVisibility(abstractC5539na2 instanceof AbstractC5539na2.b ? 0 : 8);
                }
                AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).c;
                if (appCompatImageView != null) {
                    if (abstractC5539na2 instanceof AbstractC5539na2.b) {
                        i = R.drawable.jivo_sdk_vic_message_status_sending;
                    } else {
                        if (!(abstractC5539na2 instanceof AbstractC5539na2.a)) {
                            throw new C6489s51();
                        }
                        i = R.drawable.jivo_sdk_vic_message_status_error;
                    }
                    appCompatImageView.setImageResource(i);
                }
                aVar.d = new O7(c3027bp1, c3027bp1, context, c3027bp1);
                aVar.m = null;
                aVar.n = null;
                aVar.o = null;
            } else {
                aVar.d = new P7(c3027bp1, c3027bp1, context, c3027bp1);
                aVar.m = null;
                aVar.n = null;
                aVar.o = null;
            }
            interfaceC6246qw0I.a(aVar.a());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }
}
