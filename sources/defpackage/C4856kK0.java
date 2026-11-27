package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: kK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4856kK0 {
    public static final HashMap<String, Constructor<? extends AbstractC3339dK0>> b;
    public final HashMap<Integer, ArrayList<AbstractC3339dK0>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC3339dK0>> map = new HashMap<>();
        b = map;
        try {
            map.put("KeyAttribute", C3548eK0.class.getConstructor(new Class[0]));
            map.put("KeyPosition", C5909pK0.class.getConstructor(new Class[0]));
            map.put("KeyCycle", C3758fK0.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", C6538sK0.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", C6748tK0.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            b0.d("KeyFrames", "unable to load", e);
        }
    }

    public C4856kK0() {
    }

    public final void a(C5214m11 c5214m11) {
        Integer numValueOf = Integer.valueOf(c5214m11.c);
        HashMap<Integer, ArrayList<AbstractC3339dK0>> map = this.a;
        ArrayList<AbstractC3339dK0> arrayList = map.get(numValueOf);
        if (arrayList != null) {
            c5214m11.w.addAll(arrayList);
        }
        ArrayList<AbstractC3339dK0> arrayList2 = map.get(-1);
        if (arrayList2 != null) {
            for (AbstractC3339dK0 abstractC3339dK0 : arrayList2) {
                String str = ((ConstraintLayout.a) c5214m11.b.getLayoutParams()).Y;
                String str2 = abstractC3339dK0.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c5214m11.w.add(abstractC3339dK0);
                }
            }
        }
    }

    public final void b(AbstractC3339dK0 abstractC3339dK0) {
        Integer numValueOf = Integer.valueOf(abstractC3339dK0.b);
        HashMap<Integer, ArrayList<AbstractC3339dK0>> map = this.a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(abstractC3339dK0.b), new ArrayList<>());
        }
        ArrayList<AbstractC3339dK0> arrayList = map.get(Integer.valueOf(abstractC3339dK0.b));
        if (arrayList != null) {
            arrayList.add(abstractC3339dK0);
        }
    }

    public C4856kK0(Context context, XmlResourceParser xmlResourceParser) {
        Exception e;
        AbstractC3339dK0 abstractC3339dK0NewInstance;
        HashMap<String, a> map;
        HashMap<String, a> map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC3339dK0 abstractC3339dK0 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends AbstractC3339dK0>> map3 = b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor<? extends AbstractC3339dK0> constructor = map3.get(name);
                            if (constructor != null) {
                                abstractC3339dK0NewInstance = constructor.newInstance(new Object[0]);
                                try {
                                    abstractC3339dK0NewInstance.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(abstractC3339dK0NewInstance);
                                } catch (Exception e2) {
                                    e = e2;
                                    b0.d("KeyFrames", "unable to create ", e);
                                }
                                abstractC3339dK0 = abstractC3339dK0NewInstance;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception e3) {
                            AbstractC3339dK0 abstractC3339dK1 = abstractC3339dK0;
                            e = e3;
                            abstractC3339dK0NewInstance = abstractC3339dK1;
                        }
                        b0.d("KeyFrames", "unable to create ", e);
                        abstractC3339dK0 = abstractC3339dK0NewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC3339dK0 != null && (map2 = abstractC3339dK0.d) != null) {
                            a.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC3339dK0 != null && (map = abstractC3339dK0.d) != null) {
                        a.d(context, xmlResourceParser, map);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
