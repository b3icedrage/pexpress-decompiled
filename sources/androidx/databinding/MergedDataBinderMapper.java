package androidx.databinding;

import android.view.View;
import defpackage.AbstractC4879kS;
import defpackage.InterfaceC5089lS;
import io.sentry.android.core.b0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC4879kS {
    public final HashSet a = new HashSet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // defpackage.AbstractC4879kS
    public final ViewDataBinding b(InterfaceC5089lS interfaceC5089lS, View view, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingB = ((AbstractC4879kS) it.next()).b(interfaceC5089lS, view, i);
            if (viewDataBindingB != null) {
                return viewDataBindingB;
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.c;
        boolean z = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC4879kS.class.isAssignableFrom(cls)) {
                    c((AbstractC4879kS) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                b0.d("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                b0.d("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        if (z) {
            return b(interfaceC5089lS, view, i);
        }
        return null;
    }

    public final void c(AbstractC4879kS abstractC4879kS) {
        if (this.a.add(abstractC4879kS.getClass())) {
            this.b.add(abstractC4879kS);
            Iterator<AbstractC4879kS> it = abstractC4879kS.a().iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }
}
