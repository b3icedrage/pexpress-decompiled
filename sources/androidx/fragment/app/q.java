package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public ArrayList<a> a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p;

    public static final class a {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public androidx.lifecycle.g.b h;
        public androidx.lifecycle.g.b i;

        public a() {
        }

        public a(Fragment fragment, int i) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            androidx.lifecycle.g.b bVar = androidx.lifecycle.g.b.i;
            this.h = bVar;
            this.i = bVar;
        }

        public a(Fragment fragment, int i, int i2) {
            this.a = i;
            this.b = fragment;
            this.c = true;
            androidx.lifecycle.g.b bVar = androidx.lifecycle.g.b.i;
            this.h = bVar;
            this.i = bVar;
        }
    }

    public final void b(a aVar) {
        this.a.add(aVar);
        aVar.d = this.b;
        aVar.e = this.c;
        aVar.f = this.d;
        aVar.g = this.e;
    }

    public abstract void c(int i, Fragment fragment, String str, int i2);
}
