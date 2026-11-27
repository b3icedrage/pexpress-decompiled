package defpackage;

import java.util.ArrayList;
import org.codehaus.janino.ScriptEvaluator;

/* JADX INFO: loaded from: classes.dex */
public abstract class MD0<E> extends AbstractC5661o80<E> {
    public int j = 0;
    public final ArrayList k = new ArrayList();

    @Override // defpackage.InterfaceC5451n80
    public final boolean e(InterfaceC6237qt0 interfaceC6237qt0) throws U70 {
        if (!this.i) {
            throw new IllegalStateException(C5807oq.b(new StringBuilder("Evaluator ["), this.h, "] was called in stopped state"));
        }
        ScriptEvaluator scriptEvaluator = null;
        try {
            scriptEvaluator.evaluate(r(interfaceC6237qt0));
            throw null;
        } catch (Exception e) {
            int i = this.j + 1;
            this.j = i;
            if (i >= 4) {
                this.i = false;
            }
            throw new U70(C5807oq.b(new StringBuilder("Evaluator ["), this.h, "] caused an exception"), e);
        }
    }

    public abstract String q();

    public abstract Object[] r(InterfaceC6237qt0 interfaceC6237qt0);

    @Override // defpackage.InterfaceC7183vP0
    public final void start() {
        try {
            q();
            throw null;
        } catch (Exception e) {
            m("Could not start evaluator with expression [null]", e);
        }
    }
}
