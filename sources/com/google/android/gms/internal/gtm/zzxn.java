package com.google.android.gms.internal.gtm;

import defpackage.ID;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class zzxn {
    private static final Logger zza = Logger.getLogger(zzuq.class.getName());
    private static final String zzb = "com.google.android.gms.internal.gtm.zztr";

    public static zzxf zzb(Class cls) {
        String strC;
        ClassLoader classLoader = zzxn.class.getClassLoader();
        if (cls.equals(zzxf.class)) {
            strC = zzb;
        } else {
            if (!cls.getPackage().equals(zzxn.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            strC = ID.c(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzxf) cls.cast(((zzxn) Class.forName(strC, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzxn.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzxf) cls.cast(((zzxn) it.next()).zza()));
                } catch (ServiceConfigurationError e5) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzxf) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzxf) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract zzxf zza();
}
