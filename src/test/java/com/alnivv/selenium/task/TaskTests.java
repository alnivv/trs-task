package com.alnivv.selenium.task;

import com.alnivv.selenium.WebDriverSettings;
import com.alnivv.selenium.task.pages.PlanningFrequencyPage;
import com.alnivv.selenium.task.pages.ProcessStagePage;
import com.alnivv.selenium.task.pages.ProcessTypePage;
import org.junit.Test;

public class TaskTests extends WebDriverSettings {


    @Test
    public void processTypePageTest() {
        ProcessTypePage procTypePage = new ProcessTypePage(driver);

        System.out.println("STEP 3: Going to process types page");
        procTypePage.selectProcessType();

        System.out.println("STEP 4: Adding new process type");
        procTypePage.addProcessType();

        System.out.println("STEP 5: Switching to fill the name of process type");
        procTypePage.switchToProcessTypeNameFilling();

        System.out.println("STEP 6: Filling of the name");
        procTypePage.fillProcessTypeName("Test2");

        System.out.println("STEP 7: Saving of the name and the process type entirely");
        procTypePage.doubleSave();

        System.out.println("STEP 8: Switching to filtering the process type by name");
        procTypePage.switchToProcessTypeFiltering();

        System.out.println("STEP 9: Filling of the filter");
        procTypePage.fillProcessTypeFilter("Test2");

        System.out.println("STEP 10: Searching of required process type");
        procTypePage.searchProcessType();

        System.out.println("STEP 11: Deleting of required process type");
        procTypePage.deleteProcessType();

        System.out.println("STEP 12: Confirm of deleting");
        procTypePage.deleteProcessTypeConfirm();
    }


    @Test
    public void processStagePageTest() {

        ProcessStagePage procStagePage = new ProcessStagePage(driver);

        System.out.println("STEP 3: Going to process stages page");
        procStagePage.selectProcessStage();

        System.out.println("STEP 4: Adding new process stage");
        procStagePage.addProcessStage();

        System.out.println("STEP 5: Switching to fill the name of process stage");
        procStagePage.switchToProcessStageNameFilling();

        System.out.println("STEP 6: Filling of the name");
        procStagePage.fillProcessStageName("Test2");

        System.out.println("STEP 7: Selecting of process type option");
        procStagePage.addProcessTypeOption();

        System.out.println("STEP 8: Selecting of process responsibility option");
        procStagePage.addResponsibilityTypeOption();

        System.out.println("STEP 9: Saving options and the process stage entirely");
        procStagePage.doubleSave();

        System.out.println("STEP 10: Switching to filtering the process stage by name");
        procStagePage.switchToProcessStageFiltering();

        System.out.println("STEP 11: Filling of the filter");
        procStagePage.fillProcessStageFilter("Test2");

        System.out.println("STEP 12: Searching of required process stage");
        procStagePage.searchProcessStage();

        System.out.println("STEP 13: Deleting of required process stage");
        procStagePage.deleteProcessStage();

        System.out.println("STEP 14: Confirm of deleting");
        procStagePage.deleteProcessStageConfirm();

    }



    @Test
    public void planningFrequencyPageTest() {

        PlanningFrequencyPage planFreqPage = new PlanningFrequencyPage(driver);

        System.out.println("STEP 3: Going to planning frequency page");
        planFreqPage.selectPlanningFrequency();

        System.out.println("STEP 4: Adding new planning frequency");
        planFreqPage.addPlanningFreqency();

        System.out.println("STEP 5: Switching to fill days count");
        planFreqPage.switchToDaysCountFilling();

        System.out.println("STEP 6: Filling of days count");
        planFreqPage.fillDaysCount("15");

        System.out.println("STEP 7: Saving planning frequency");
        planFreqPage.save();

        System.out.println("STEP 8: Switching to filtering the planning frequency by days count");
        planFreqPage.switchToPlanningFrequencyFiltering();

        System.out.println("STEP 9: Filling of the filter");
        planFreqPage.fillPlanningFrequencyFilter("15");

        System.out.println("STEP 10: Searching of required planning frequency");
        planFreqPage.searchPlanningFrequency();

        System.out.println("STEP 11: Deleting of required planning frequency");
        planFreqPage.deletePlanningFrequency();

        System.out.println("STEP 12: Confirm of deleting");
        planFreqPage.deletePlanningFrequencyConfirm();

    }

}

