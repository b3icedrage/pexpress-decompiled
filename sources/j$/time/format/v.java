package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.InterfaceC4568d;
import j$.time.chrono.InterfaceC4573i;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class v implements TemporalAccessor {
    ZoneId b;
    j$.time.chrono.l c;
    boolean d;
    private w e;
    private ChronoLocalDate f;
    private LocalTime g;
    final HashMap a = new HashMap();
    j$.time.o h = j$.time.o.d;

    v() {
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (this.a.containsKey(rVar)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.d(rVar)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.d(rVar)) {
            return (rVar == null || (rVar instanceof j$.time.temporal.a) || !rVar.T(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.r rVar) {
        Objects.requireNonNull(rVar, "field");
        Long l = (Long) this.a.get(rVar);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.d(rVar)) {
            return this.f.f(rVar);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.d(rVar)) {
            return this.g.f(rVar);
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.s.g()) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.s.a()) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.s.b()) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.H(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.s.c()) {
            return this.g;
        }
        if (temporalQuery == j$.time.temporal.s.d()) {
            Long l = (Long) this.a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.s.f()) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.s.e()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
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
    final void r(w wVar) {
        long j;
        j$.time.temporal.r rVar;
        j$.time.temporal.r rVar2;
        HashMap map = this.a;
        this.e = wVar;
        s();
        A(this.c.N(map, this.e));
        w();
        if (map.size() > 0) {
            int i = 0;
            loop0: while (i < 50) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    rVar2 = (j$.time.temporal.r) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorQ = rVar2.Q(map, this, this.e);
                    if (temporalAccessorQ != null) {
                        if (temporalAccessorQ instanceof InterfaceC4573i) {
                            InterfaceC4573i interfaceC4573i = (InterfaceC4573i) temporalAccessorQ;
                            ZoneId zoneId = this.b;
                            if (zoneId == null) {
                                this.b = interfaceC4573i.O();
                            } else if (!zoneId.equals(interfaceC4573i.O())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.b);
                            }
                            temporalAccessorQ = interfaceC4573i.z();
                        }
                        if (temporalAccessorQ instanceof InterfaceC4568d) {
                            InterfaceC4568d interfaceC4568d = (InterfaceC4568d) temporalAccessorQ;
                            y(interfaceC4568d.n(), j$.time.o.d);
                            A(interfaceC4568d.o());
                            break;
                        } else if (temporalAccessorQ instanceof ChronoLocalDate) {
                            A((ChronoLocalDate) temporalAccessorQ);
                            break;
                        } else {
                            if (temporalAccessorQ instanceof LocalTime) {
                                y((LocalTime) temporalAccessorQ, j$.time.o.d);
                                break;
                            }
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    }
                } while (map.containsKey(rVar2));
                i++;
            }
            if (i == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i > 0) {
                s();
                A(this.c.N(map, this.e));
                w();
            }
        }
        long j2 = 1000000;
        if (this.g == null) {
            j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar)) {
                long jLongValue = ((Long) map.remove(aVar)).longValue();
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar2)) {
                    long jLongValue2 = (((Long) map.get(aVar2)).longValue() % 1000) + (jLongValue * 1000);
                    B(aVar, aVar2, Long.valueOf(jLongValue2));
                    map.remove(aVar2);
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l = (Long) map.get(obj2);
            if (l != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l2 = (Long) map.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l3 = (Long) map.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l4 = (Long) map.get(obj5);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    j = 0;
                    v(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                } else {
                    j2 = 1000000;
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (this.e != w.LENIENT && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    rVar = (j$.time.temporal.r) entry.getKey();
                    if (!(rVar instanceof j$.time.temporal.a) && ((j$.time.temporal.a) rVar).Y()) {
                        ((j$.time.temporal.a) rVar).X(((Long) entry.getValue()).longValue());
                    }
                }
            }
        } else {
            j = 0;
            if (this.e != w.LENIENT) {
                while (r1.hasNext()) {
                    rVar = (j$.time.temporal.r) entry.getKey();
                    if (!(rVar instanceof j$.time.temporal.a)) {
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null) {
            q(chronoLocalDate);
        }
        LocalTime localTime = this.g;
        if (localTime != null) {
            q(localTime);
            if (this.f != null && map.size() > 0) {
                q(this.f.I(this.g));
            }
        }
        if (this.f != null && this.g != null) {
            j$.time.o oVar = this.h;
            oVar.getClass();
            j$.time.o oVar2 = j$.time.o.d;
            if (oVar != oVar2) {
                this.f = this.f.K(this.h);
                this.h = oVar2;
            }
        }
        if (this.g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar3)) {
                long jLongValue3 = ((Long) map.get(aVar3)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j2));
            } else {
                map.put(aVar3, Long.valueOf(j));
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(j));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(j));
            }
        }
        if (this.f == null || this.g == null) {
            return;
        }
        Long l5 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l5 != null) {
            map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f.I(this.g).F(ZoneOffset.ofTotalSeconds(l5.intValue())).M()));
        } else if (this.b != null) {
            map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f.I(this.g).F(this.b).M()));
        }
    }

    private void B(j$.time.temporal.r rVar, j$.time.temporal.a aVar, Long l) {
        Long l2 = (Long) this.a.put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + l + " while resolving  " + rVar);
    }

    private void s() {
        HashMap map = this.a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                u(zoneId);
                return;
            }
            Long l = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                u(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    private void u(ZoneId zoneId) {
        HashMap map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        InterfaceC4573i interfaceC4573iW = this.c.w(Instant.A(((Long) map.remove(aVar)).longValue()), zoneId);
        A(interfaceC4573iW.o());
        B(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(interfaceC4573iW.n().toSecondOfDay()));
    }

    private void A(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.c.equals(chronoLocalDate.h())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = chronoLocalDate;
        }
    }

    private void w() {
        HashMap map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            w wVar = this.e;
            if (wVar == w.STRICT || (wVar == w.SMART && jLongValue != 0)) {
                aVar.X(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            B(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            w wVar2 = this.e;
            if (wVar2 == w.STRICT || (wVar2 == w.SMART && jLongValue2 != 0)) {
                aVar3.X(jLongValue2);
            }
            B(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.e == w.LENIENT) {
                    B(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.X(jLongValue3);
                    aVar5.X(jLongValue3);
                    B(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.e != w.LENIENT) {
                aVar6.X(jLongValue5);
            }
            B(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            B(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            B(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            B(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.e != w.LENIENT) {
                aVar7.X(jLongValue6);
            }
            B(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            B(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.e != w.LENIENT) {
                aVar8.X(jLongValue7);
            }
            B(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            B(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.e != w.LENIENT) {
                aVar9.X(jLongValue8);
            }
            B(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            B(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            B(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.e != w.LENIENT) {
                aVar10.X(jLongValue9);
            }
            B(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            B(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            w wVar3 = this.e;
            w wVar4 = w.LENIENT;
            if (wVar3 != wVar4) {
                aVar11.X(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.e != wVar4) {
                    aVar12.X(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                B(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.e != wVar4) {
                    aVar13.X(jLongValue12);
                }
                B(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    v(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void v(long j, long j2, long j3, long j4) {
        if (this.e == w.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            y(LocalTime.X(Math.floorMod(jAddExact, 86400000000000L)), j$.time.o.b((int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        int iW = j$.time.temporal.a.MINUTE_OF_HOUR.W(j2);
        int iW2 = j$.time.temporal.a.NANO_OF_SECOND.W(j4);
        if (this.e == w.SMART && j == 24 && iW == 0 && j3 == 0 && iW2 == 0) {
            y(LocalTime.e, j$.time.o.b(1));
        } else {
            y(LocalTime.of(j$.time.temporal.a.HOUR_OF_DAY.W(j), iW, j$.time.temporal.a.SECOND_OF_MINUTE.W(j3), iW2), j$.time.o.d);
        }
    }

    private void y(LocalTime localTime, j$.time.o oVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.g + " " + localTime);
            }
            j$.time.o oVar2 = this.h;
            oVar2.getClass();
            j$.time.o oVar3 = j$.time.o.d;
            if (oVar2 != oVar3 && oVar != oVar3 && !this.h.equals(oVar)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.h + " " + oVar);
            }
            this.h = oVar;
            return;
        }
        this.g = localTime;
        this.h = oVar;
    }

    private void q(TemporalAccessor temporalAccessor) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.r rVar = (j$.time.temporal.r) entry.getKey();
            if (temporalAccessor.d(rVar)) {
                try {
                    long jF = temporalAccessor.f(rVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jF != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + rVar + " " + jF + " differs from " + rVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
