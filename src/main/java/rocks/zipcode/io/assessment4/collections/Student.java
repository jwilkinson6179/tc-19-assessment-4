package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student
{
    List<Lab> labs;

    public Student()
    {
        labs = new ArrayList<>();
    }

    public Student(List<Lab> inputLabs)
    {
        labs = new ArrayList<>();

        this.labs.addAll(inputLabs);
    }

    public Lab getLab(String labName)
    {
        for (Lab element : labs) {
            if (element.getName().equals(labName))
            {
                return element;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus)
    {
        try
        {
            Lab labToChange = getLab(labName);
            labToChange.setStatus(labStatus);
        }
        catch (Exception e)
        {
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab)
    {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName)
    {
        for (Lab element : labs)
        {
            if (element.getName().equals(labName))
            {
                return element.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString()
    {
        StringBuilder output = new StringBuilder();

        for(Integer i = labs.size() - 1; i > - 1; i--)
        {
            Lab currentLab = labs.get(i);
            output.append(String.format("%s > %s\n", currentLab.getName(), currentLab.getStatus()));
        }

        return output.substring(0, output.length() - 1);
    }
}