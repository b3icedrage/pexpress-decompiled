package defpackage;

import java.util.ArrayList;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.ObjectName;

/* JADX INFO: loaded from: classes.dex */
public final class ED0 extends C5494nM implements IS0 {
    public HS0 h;
    public MBeanServer i;
    public ObjectName j;
    public final String k;
    public boolean l = true;

    public ED0(HS0 hs0, MBeanServer mBeanServer, ObjectName objectName) {
        this.e = hs0;
        this.h = hs0;
        this.i = mBeanServer;
        this.j = objectName;
        String string = objectName.toString();
        this.k = string;
        if (!q()) {
            hs0.q.add(this);
            return;
        }
        StringBuilder sbB = C6495s7.b("Previously registered JMXConfigurator named [", string, "] in the logger context named [");
        sbB.append(hs0.e);
        sbB.append("]");
        l(sbB.toString());
    }

    @Override // defpackage.IS0
    public final void h() {
        n("onReset() method called JMXActivator [" + this.k + "]");
    }

    @Override // defpackage.IS0
    public final void onStop() {
        boolean z = this.l;
        String str = this.k;
        if (!z) {
            n("onStop() method called on a stopped JMXActivator [" + str + "]");
            return;
        }
        if (this.i.isRegistered(this.j)) {
            try {
                n("Unregistering mbean [" + str + "]");
                this.i.unregisterMBean(this.j);
            } catch (InstanceNotFoundException e) {
                m("Unable to find a verifiably registered mbean [" + str + "]", e);
            } catch (MBeanRegistrationException e2) {
                m("Failed to unregister [" + str + "]", e2);
            }
        } else {
            n("mbean [" + str + "] was not in the mbean registry. This is OK.");
        }
        this.l = false;
        this.i = null;
        this.j = null;
        this.h = null;
    }

    public final boolean q() {
        HS0 hs0 = this.h;
        hs0.getClass();
        for (IS0 is0 : new ArrayList(hs0.q)) {
            if ((is0 instanceof ED0) && this.j.equals(((ED0) is0).j)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ED0.class.getName());
        sb.append("(");
        return C5807oq.b(sb, this.e.e, ")");
    }
}
