package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class V70 extends AbstractC5858p5 {
    public InterfaceC5451n80 h;
    public boolean i;

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        this.i = false;
        this.h = null;
        String value = attributesImpl.getValue("class");
        if (C8056za.m(value)) {
            value = LD0.class.getName();
            n("Assuming default evaluator class [" + value + "]");
        }
        if (C8056za.m(value)) {
            this.i = true;
            l("Mandatory \"class\" attribute not set for <evaluator>");
            return;
        }
        String value2 = attributesImpl.getValue(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (C8056za.m(value2)) {
            this.i = true;
            l("Mandatory \"name\" attribute not set for <evaluator>");
            return;
        }
        try {
            InterfaceC5451n80 interfaceC5451n80 = (InterfaceC5451n80) C8056za.k(value, InterfaceC5451n80.class, this.e);
            this.h = interfaceC5451n80;
            interfaceC5451n80.j(this.e);
            this.h.b(value2);
            c3315dC0.t(this.h);
            n("Adding evaluator named [" + value2 + "] to the object stack");
        } catch (Exception e) {
            this.i = true;
            m("Could not create evaluator of type " + value + "].", e);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (this.i) {
            return;
        }
        InterfaceC5451n80 interfaceC5451n80 = this.h;
        if (interfaceC5451n80 != null) {
            interfaceC5451n80.start();
            n("Starting evaluator named [" + this.h.getName() + "]");
        }
        if (c3315dC0.h.peek() != this.h) {
            p("The object on the top the of the stack is not the evaluator pushed earlier.");
            return;
        }
        c3315dC0.s();
        try {
            Map map = (Map) this.e.i.get("EVALUATOR_MAP");
            if (map == null) {
                l("Could not find EvaluatorMap");
            } else {
                map.put(this.h.getName(), this.h);
            }
        } catch (Exception e) {
            m("Could not set evaluator named [" + this.h + "].", e);
        }
    }
}
