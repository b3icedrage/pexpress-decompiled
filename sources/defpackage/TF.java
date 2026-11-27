package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class TF {

    @Nullable
    public Integer a;

    @Nullable
    public List<? extends Object> b;

    @Nullable
    public Integer c;

    @Nullable
    public String d;

    @Nullable
    public List<? extends Object> e;

    @Nullable
    public Integer f;

    @Nullable
    public Integer g;

    @Nullable
    public Integer h;
    public int i = R.color.defaultActiveButtonColor;
    public int j = R.color.defaultActionButtonTextColor;

    @NotNull
    public Function0<Unit> k = new OF();

    @NotNull
    public Function0<Unit> l = new PF();

    @NotNull
    public Function0<Unit> m = new QF();
    public boolean n = true;
    public boolean o = true;

    public static abstract class a<T extends TF> {

        @NotNull
        public final TF a = new TF();

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, Integer num, Function0 function0, int i) {
            if ((i & 8) != 0) {
                function0 = new RF(0);
            }
            aVar.a(num, R.color.defaultActiveButtonColor, R.color.defaultActionButtonTextColor, function0);
        }

        public static void e(a aVar, Integer num, Function0 action, int i) {
            if ((i & 4) != 0) {
                action = new SF();
            }
            aVar.getClass();
            Intrinsics.checkNotNullParameter(action, "action");
            TF tf = aVar.a;
            tf.h = num;
            tf.m = action;
        }

        public final void a(@Nullable Integer num, int i, int i2, @NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            TF tf = this.a;
            tf.g = num;
            tf.l = action;
            tf.i = i;
            tf.j = i2;
        }

        public final <T extends TF> void c(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "<this>");
            TF tf = this.a;
            t.a = tf.a;
            t.b = tf.b;
            t.c = tf.c;
            t.d = tf.d;
            t.e = tf.e;
            t.f = tf.f;
            t.g = tf.g;
            t.h = tf.h;
            t.i = tf.i;
            t.j = tf.j;
            t.k = tf.k;
            t.l = tf.l;
            t.m = tf.m;
            t.n = tf.n;
            t.o = tf.o;
        }

        public final void d(int i) {
            this.a.f = Integer.valueOf(i);
        }

        public final void f(int i) {
            this.a.c = Integer.valueOf(i);
        }

        public final void g(int i) {
            this.a.a = Integer.valueOf(i);
        }
    }
}
